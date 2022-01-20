package com.example.sportradar;

import com.example.sportradar.model.Event;
import com.example.sportradar.model.EventList;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@SpringBootApplication
public class SportRadarApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SportRadarApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        EventList eventList = objectMapper.readValue(new File("/Users/angel/IdeaProjects/SportRadar/src/main/resources/data.json"), EventList.class );

//        System.out.println(event.getCompetition_name());

        System.out.println( eventList.getEvent().get(0).getProbability_away_team_winner());


        ArrayList<Double> chanseContainer = new ArrayList<Double>();

        for (int i = 0; i < eventList.getEvent().size()  ;  i++){
            chanseContainer.add(eventList.getEvent().get(i).getProbability_home_team_winner());
            chanseContainer.add(eventList.getEvent().get(i).getProbability_draw());
            chanseContainer.add(eventList.getEvent().get(i).getProbability_away_team_winner());
        }

        Collections.sort(chanseContainer);

        Collections.reverse(chanseContainer);

        System.out.println(eventList.getEvent().get(0).getProbability_draw());



        System.out.println(chanseContainer);

        for (int i  =0; i< eventList.getEvent().size()-1; i++ ){
            for (int j = 0; j < 10 ; j++) {
                if (eventList.getEvent().get(i).getProbability_away_team_winner() == chanseContainer.get(j)
                        || eventList.getEvent().get(i).getProbability_draw() == chanseContainer.get(j)
                        || eventList.getEvent().get(i).getProbability_home_team_winner() == chanseContainer.get(j)) {
                    System.out.println(eventList.getEvent().get(i).getSport_event_id());
                }
            }
        }









    }
}

