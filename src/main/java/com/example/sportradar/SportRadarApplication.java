package com.example.sportradar;

import com.example.sportradar.mapper.ProbableResultMapper;
import com.example.sportradar.model.Event;
import com.example.sportradar.model.EventList;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SportRadarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportRadarApplication.class, args);
    }
}



