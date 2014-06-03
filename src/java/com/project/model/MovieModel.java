/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mohapi
 */
@Entity
@Table(name = "tblMovie")
public class MovieModel implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="movieId")
    public long movieId;
    @Column(name="movieTitle")
    private String movieTitle;
    @Column(name="movieDescription")
    private String movieDescription;
    @OneToMany(mappedBy="department",cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<DVDModel> dvdModel;
    public void setMovieId(long movieId) 
    {
      this.movieId = movieId;
    }
    public String getMovieTitle()
    {
      return movieTitle;
    }
    public void setMovieTitle(String movieTitle) 
    {
      this.movieTitle = movieTitle;
    }
    public String getMovieDescription() 
    {
     return movieDescription;
    }
    public void setMovieDescription(String movieDescription)
    {
      this.movieDescription = movieDescription;
    }
    public MovieModel(long movieId, String movieTitle, String movieDescription)
    {
      this.movieId = movieId;
      this.movieTitle = movieTitle;
      this.movieDescription = movieDescription;
    }
    public MovieModel()
    {
        
    }

    /**
     * @return the movieId
     */
    public long getMovieId() {
        return movieId;
    }
}
