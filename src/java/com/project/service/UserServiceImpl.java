/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.service;


import com.project.dao.UserInterfacedao;
import com.project.model.UserModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mohapi
 */
@Service("UserService")
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class UserServiceImpl implements UserServiceInt
{

    @Autowired
    private UserInterfacedao users;
    @Override
    public void addUsers(UserModel user) 
    {
        users.addUsers(user);
    }

    @Override
    public List<UserModel> listUsers() 
    { 
        return users.listUsers();
    }

    @Override
    public UserModel getUserModel(String userName) 
    {
        return users.getUserModel(userName);
    }

    @Override
    public void deleteEmployee(UserModel user) 
    {
       users.deleteEmployee(user);
    }
    
}
