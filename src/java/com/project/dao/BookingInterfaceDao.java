/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.dao;

import com.project.model.Bookings;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Mohapi
 */
public interface BookingInterfaceDao 
{
    public void saveBooking(Bookings bookig);
    public Bookings getBooking(Date bookingDate);
    public List<Bookings> listBookings();
    public void deleteBooking(Bookings mobookig);
    public void updateBooking(Bookings bookig);
}
