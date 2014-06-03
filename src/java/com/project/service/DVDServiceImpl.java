/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.service;

import com.project.dao.DVDInterfaceDao;
import com.project.model.DVDModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mohapi
 */
@Service("DVDService")
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class DVDServiceImpl implements DVDServiceInt
{

    @Autowired
    private DVDInterfaceDao dvds;
    @Override
    public void saveMovie(DVDModel dvd) 
    {
        dvds.saveMovie(dvd);
    }

    @Override
    public DVDModel getMovie(long dvd) 
    {
        return dvds.getMovie(dvd);
    }

    @Override
    public List<DVDModel> listDVDs() 
    {
        return dvds.listDVDs();
    }

    @Override
    public void deleteMovie(DVDModel dvd) 
    {
        dvds.deleteMovie(dvd);
    }

    @Override
    public void updateMovie(DVDModel dvd) 
    {
        dvds.updateMovie(dvd);
    }
    
}
