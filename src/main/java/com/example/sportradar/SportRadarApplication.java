package com.example.sportradar;

import com.example.sportradar.model.Event;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class SportRadarApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SportRadarApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        Event event = objectMapper.readValue(new File("/Users/angel/IdeaProjects/SportRadar/src/main/resources/data.json"), Event.class );

        System.out.println(event);




    }
}

