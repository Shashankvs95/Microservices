package com.lcwd.hotel.service;

import com.lcwd.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {
    Hotel createHotel(Hotel hotel);

    List<Hotel> getAllHotel();

    Hotel getHotel(String hotelId);

    void deleteHotel(String hotelId);
}
