/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Mohapi
 */
@Entity
@Table(name ="tblBookings")
public class Bookings implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name ="bookingDate")
    private Date bookingDate;
    @Column(name="dvdSerialNo")
    @ManyToOne
    @JoinColumn(name="dvdSerialNo")
     private DVDModel dvdSerialNo;
    
    @ManyToOne
    @Column(name="userName")
    @JoinColumn(name = "userName")
    private Renter userName;
    
    @Column(name="trackNo")
    private int trackNo;

    public Bookings() {
    }
	
	public int getTrackNo() {
		return trackNo;
	}
	public void setTrackNo(int trackNo) {
		this.trackNo = trackNo;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public DVDModel getDvdSerialNo() {
		return dvdSerialNo;
	}
	public void setDvdSerialNo(DVDModel dvdSerialNo) {
		this.dvdSerialNo = dvdSerialNo;
	}
	public UserModel getUserName() {
		return userName;
	}
	public void setUserName(Renter userName) {
		this.userName = userName;
	}
	public Bookings(Date bookingDate, DVDModel dvdSerialNo,Renter userName,int tracNo) {
		this.bookingDate = bookingDate;
		this.dvdSerialNo = dvdSerialNo;
		this.userName = userName;
		this.trackNo = tracNo;
        }
}
