/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.service;

import com.project.model.MovieModel;
import java.util.List;

/**
 *
 * @author Mohapi
 */
public interface MovieServiceInt 
{
     public void saveMovie(MovieModel movie);
    public MovieModel getMovie(long movieID);
    public List<MovieModel> listMovies();
    public void deleteMovie(MovieModel movie);
    public void updateMovie(MovieModel movie);
}
