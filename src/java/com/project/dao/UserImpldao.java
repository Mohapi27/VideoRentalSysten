/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.dao;

import com.project.model.UserModel;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mohapi
 */
@Repository("UserImpldao")
public class UserImpldao implements UserInterfacedao
{

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void addUsers(UserModel user) 
    {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @Override
    public List<UserModel> listUsers() 
    {
       return (List<UserModel>)(UserModel)sessionFactory.getCurrentSession().createCriteria(UserModel.class).list();
    }

    @Override
    public UserModel getUserModel(String userName) 
    {
        return (UserModel)sessionFactory.getCurrentSession().get(UserModel.class, userName);
    }

    @Override
    public void deleteEmployee(UserModel user) 
    {
        sessionFactory.getCurrentSession().createQuery("delete from UserModel where userName ="+ user.getUserName()).executeUpdate();
    }
    
}
