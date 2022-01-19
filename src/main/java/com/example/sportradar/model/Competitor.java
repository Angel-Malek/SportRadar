package com.example.sportradar.model;

public class Competitor {
    private String id;
    private String name;
    private String country;
    private String country_code;
    private String abbreviation;
    private String qualifier;
    private String gender;

    public Competitor() {
    }

    public Competitor(String id, String name, String country, String country_code, String abbreviation, String qualifier, String gender) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.country_code = country_code;
        this.abbreviation = abbreviation;
        this.qualifier = qualifier;
        this.gender = gender;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Competitor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", country_code='" + country_code + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", qualifier='" + qualifier + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
