package com.hotelapp.model;

 

public class Hotel {
    String name;
    String city;
    String cuisine;
    
    public Hotel() {
        super();
    }
    
    public Hotel(String name, String city, String cuisine) {
        super();
        
        this.name = name;
        this.city = city;
        this.cuisine = cuisine;
        
    }

 

    public String getName() {
        return name;
    }

 

    public void setName(String name) {
        this.name = name;
    }

 

    public String getCity() {
        return city;
    }

 

    public void setCity(String city) {
        this.city = city;
    }

 

    public String getCuisine() {
        return cuisine;
    }

 

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

 

    @Override
    public String toString() {
        return "Hotel [name=" + name + ", city=" + city + ", cuisine=" + cuisine + "]";
    }

 

    
    
    
  
}