package com.hotelapp.service;

 

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

import com.hotelapp.dao.HotelDAO;
import com.hotelapp.dao.HotelDAOImpl;
import com.hotelapp.model.Hotel;
@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    HotelDAO hotelDAO;

 

    @Override
    public List<Hotel> getAllHotels() {
        return hotelDAO.getAllHotels();
    }

 

    @Override
    public List<Hotel> getByName(String name) {
        return hotelDAO.getByName(name);
    }

 

    @Override
    public List<Hotel> getByCity(String city) {
        return hotelDAO.getByCity(city);
    }
    @Override
    public List<Hotel> getByCuisine(String cuisine) {
        return hotelDAO.getByCuisine(cuisine);
    }

 


}
 