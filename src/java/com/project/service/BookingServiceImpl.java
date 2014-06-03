/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.service;

import com.project.dao.BookingInterfaceDao;
import com.project.model.Bookings;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mohapi
 */
@Service("BookingService")
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class BookingServiceImpl implements BookingServiceInt
{
    @Autowired
    private BookingInterfaceDao bookings;

    @Override
    public void saveBooking(Bookings bookig) 
    {
        bookings.saveBooking(bookig);
    }

    @Override
    public Bookings getBooking(Date bookingDate)
    {
        return bookings.getBooking(bookingDate);
    }

    @Override
    public List<Bookings> listBookings() 
    {
        return bookings.listBookings();
    }

    @Override
    public void deleteBooking(Bookings mobookig)
    {
        bookings.deleteBooking(mobookig);
    }

    @Override
    public void updateBooking(Bookings bookig) 
    {
       bookings.updateBooking(bookig);
    }
    
}
