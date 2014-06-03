/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.service;

import com.project.dao.MovieInterfaceDao;
import com.project.model.MovieModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mohapi
 */
@Service("MovieService")
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class MovieServiceImpl implements MovieServiceInt
{
    @Autowired
    private MovieInterfaceDao movies;

    @Override
    public void saveMovie(MovieModel movie) 
    {
        movies.saveMovie(movie);
    }

    @Override
    public MovieModel getMovie(long movieID) 
    {
       return movies.getMovie(movieID);
    }

    @Override
    public List<MovieModel> listMovies()
    {
        return movies.listMovies();
    }

    @Override
    public void deleteMovie(MovieModel movie) 
    {
        movies.deleteMovie(movie);
    }

    @Override
    public void updateMovie(MovieModel movie) 
    {
        movies.updateMovie(movie);
    }
    
}
