package com.example.sportradar.model;

public class Venue {
    private String id;
    private String name;
    private Integer capacity;
    private String city_name;
    private String country_name;
    private String map_coordinates;
    private String country_code;

    public Venue() {
    }

    public Venue(String id, String name, Integer capacity, String city_name, String country_name, String map_coordinates, String country_code) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.city_name = city_name;
        this.country_name = country_name;
        this.map_coordinates = map_coordinates;
        this.country_code = country_code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getMap_coordinates() {
        return map_coordinates;
    }

    public void setMap_coordinates(String map_coordinates) {
        this.map_coordinates = map_coordinates;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", city_name='" + city_name + '\'' +
                ", country_name='" + country_name + '\'' +
                ", map_coordinates='" + map_coordinates + '\'' +
                ", country_code='" + country_code + '\'' +
                '}';
    }

}
