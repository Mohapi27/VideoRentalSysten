/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.dao;

import com.project.model.DVDModel;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mohapi
 */
@Repository("DVDImplDao")
public class DVDImplDao implements DVDInterfaceDao
{

    private SessionFactory sessionFactory;
    @Override
    public void saveMovie(DVDModel dvd) 
    {
        sessionFactory.getCurrentSession().save(dvd);
    }

    @Override
    public DVDModel getMovie(long dvdSerialNo) 
    {
        return (DVDModel)sessionFactory.getCurrentSession().get(DVDModel.class, dvdSerialNo);
    }

    @Override
    public List<DVDModel> listDVDs() 
    {
        return (List<DVDModel>)sessionFactory.getCurrentSession().createCriteria(DVDModel.class).list();
    }
     @Override
    public void deleteMovie(DVDModel dvd) 
    {
        sessionFactory.getCurrentSession().createQuery("delete from DVDModel where dvdSerialNo ="+ dvd.getDvdSerialNo()).executeUpdate();
    }

    @Override
    public void updateMovie(DVDModel dvd) 
    {
        sessionFactory.getCurrentSession().createQuery("update from DVDModel where dvdSerialNo ="+ dvd.getDvdSerialNo()).executeUpdate();
    }
    
}
