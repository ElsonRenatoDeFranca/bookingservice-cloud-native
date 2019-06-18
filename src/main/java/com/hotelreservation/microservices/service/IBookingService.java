package com.hotelreservation.microservices.service;

import com.hotelreservation.microservices.entity.Booking;
import com.hotelreservation.microservices.entity.Guest;
import com.hotelreservation.microservices.entity.Room;

/**
 * Created by e068635 on 6/18/2019.
 */
public interface IBookingService {


    public Booking checkIn(Guest guest, Room room);

    public Booking checkOut(Guest guest, Room room);

}
