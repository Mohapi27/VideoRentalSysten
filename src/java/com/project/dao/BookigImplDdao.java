/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.dao;

import com.project.model.Bookings;
import com.project.model.DVDModel;
import java.util.Date;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mohapi
 */
@Repository("BookigImplDdao")
public class BookigImplDdao implements BookingInterfaceDao
{

    private SessionFactory sessionFactory;
    @Override
    public void saveBooking(Bookings booking) 
    {
        sessionFactory.getCurrentSession().save(booking);
    }

    @Override
    public Bookings getBooking(Date bookingDate) 
    {
        return (Bookings)sessionFactory.getCurrentSession().get(Bookings.class, bookingDate);
    }

    @Override
    public List<Bookings> listBookings() 
    {
        return (List<Bookings>)sessionFactory.getCurrentSession().createCriteria(Bookings.class).list();
    }

    @Override
    public void deleteBooking(Bookings bookig) 
    {
        sessionFactory.getCurrentSession().createQuery("delete from Bookings where bookingDate ="+ bookig.getBookingDate()).executeUpdate();
    }
    @Override
    public void updateBooking(Bookings bookig) 
    {
       sessionFactory.getCurrentSession().createQuery("upddate from Bookings where bookingDate ="+ bookig.getBookingDate()).executeUpdate();
    }
    
}
