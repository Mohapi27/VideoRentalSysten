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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mohapi
 */
@Entity
@Table(name ="tblDVDs")
//@DiscriminatorValue("DVDModel")
public class DVDModel implements Serializable
{
    private static final long serialVersionUID = 1L;
	@Id
	@Column(name="dvdSerialNo")
	private long dvdSerialNo;
	@Column(name="movieId")
	@ManyToOne
	@JoinColumn(name="movieId")
	private MovieModel movieId;
	@Column (name="dvdQuantity")
	private int dvdQuantity;
	
	
	@OneToMany(mappedBy="dvdSerialNo",cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Bookings> dvdBookings;
	public long getDvdSerialNo() {
		return dvdSerialNo;
	}
	public void setDvdSerialNo(long dvdSerialNo) {
		this.dvdSerialNo = dvdSerialNo;
	}
	public MovieModel getMovieId() {
		return movieId;
	}
	public void setMovieId(MovieModel movieId) {
		this.movieId = movieId;
	}
	public int getDvdQuantity() {
		return dvdQuantity;
	}
	public void setDvdQuantity(int dvdQuantity) {
		this.dvdQuantity = dvdQuantity;
	}
	public DVDModel(long dvdSerialNo, int dvdQuantity,MovieModel movieId) {
		this.dvdSerialNo = dvdSerialNo;
		this.dvdQuantity = dvdQuantity;
                this.movieId = movieId;
	}
	public DVDModel()
        {
            
        }
}
