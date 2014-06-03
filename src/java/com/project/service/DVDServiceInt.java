/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.service;

import com.project.model.DVDModel;
import java.util.List;

/**
 *
 * @author Mohapi
 */
public interface DVDServiceInt 
{
    public void saveMovie(DVDModel dvd);
    public DVDModel getMovie(long dvd);
    public List<DVDModel> listDVDs();
    public void deleteMovie(DVDModel dvd);
    public void updateMovie(DVDModel dvd);
}
