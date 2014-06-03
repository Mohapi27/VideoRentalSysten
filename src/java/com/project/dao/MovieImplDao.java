/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.dao;

import com.project.model.MovieModel;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mohapi
 */
@Repository("MovieImplDao")
public class MovieImplDao implements MovieInterfaceDao
{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveMovie(MovieModel movie) 
    {
        sessionFactory.getCurrentSession().save(movie);
    }

    @Override
    public MovieModel getMovie(long movieID) 
    {
        return (MovieModel)sessionFactory.getCurrentSession().get(MovieModel.class, movieID);
    }

    @Override
    public List<MovieModel> listMovies() 
    {
        return (List<MovieModel>)sessionFactory.getCurrentSession().createCriteria(MovieModel.class).list();
    }

    @Override
    public void deleteMovie(MovieModel movie) 
    {
        sessionFactory.getCurrentSession().createQuery("delete from MovieModel where movieId ="+ movie.getMovieId()).executeUpdate();
    }

    @Override
    public void updateMovie(MovieModel movie) 
    {
        sessionFactory.getCurrentSession().createQuery("update from MovieModel where movieId ="+ movie.getMovieId()).executeUpdate();
    }
}
