package com.Solitude.Service;

import com.Solitude.Entity.User;
import com.Solitude.RESTHelpers.BookingEvent;

public interface UserService {

    public boolean checkIn(User user, BookingEvent event);

    public boolean checkOut(User user, BookingEvent event);
}