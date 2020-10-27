package com.hotelapp.dao;

 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 

import org.springframework.stereotype.Service;

 

import com.hotelapp.model.Hotel;
@Service
public class HotelDAOImpl implements HotelDAO{

 

    @Override
    public List<Hotel> getAllHotels() {
        // TODO Auto-generated method stub
        return showHotelList();
    }

 

    @Override
    public List<Hotel> getByName(String name) {
        // TODO Auto-generated method stub
        List<Hotel> newHotelList=new ArrayList<>();
        for(Hotel hotel:showHotelList()) {
            if(hotel.getName().equals(name))
                newHotelList.add(hotel);
        }
        return newHotelList;
    }

 

    @Override
    public List<Hotel> getByCity(String city) {
        List<Hotel> newHotelList=new ArrayList<>();
        for(Hotel hotel:showHotelList()) {
            if(hotel.getCity().equals(city))
                newHotelList.add(hotel);
        }
        return newHotelList;
    
    }
    @Override
    public List<Hotel> getByCuisine(String cuisine) {
        List<Hotel> newHotelList=new ArrayList<>();
        for(Hotel hotel:showHotelList()) {
            if(hotel.getCuisine().equals(cuisine))
                newHotelList.add(hotel);
        }
        return newHotelList;
    
    }

 


    
    private List<Hotel> showHotelList(){
        return Arrays.asList(
                new Hotel("swadh","ooty","Non-veg"),
                new Hotel("RoyalGrands","Mysore","Veg"),
                new Hotel("Mgr","Kadapa","Non-veg")
                
                );
    }

 

}
 