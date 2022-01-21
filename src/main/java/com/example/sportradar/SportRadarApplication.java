package com.example.sportradar;

import com.example.sportradar.mapper.ProbableResultMapper;
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
import java.util.List;

@SpringBootApplication
public class SportRadarApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SportRadarApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();


        File file = new File(
                getClass().getClassLoader().getResource("data.json").getFile()
        );
        EventList eventList = objectMapper.readValue(file, EventList.class);

        mostProbableEvents(eventList);



    }

    private void mostProbableEvents(EventList eventList) {
        long expectedMatches  = 10;

        List<Double> chanseContainer = new ArrayList<Double>();

        for (int i = 0; i < eventList.getEvent().size(); i++) {
            chanseContainer.add(eventList.getEvent().get(i).getProbability_home_team_winner());
            chanseContainer.add(eventList.getEvent().get(i).getProbability_draw());
            chanseContainer.add(eventList.getEvent().get(i).getProbability_away_team_winner());
        }

        Collections.sort(chanseContainer);
        Collections.reverse(chanseContainer);
        List<Event> mostProbableEvents =  new ArrayList<>();
        for (int i = 0; i < eventList.getEvent().size() - 1; i++) {
            for (int j = 0; j < expectedMatches; j++) {
                if (eventList.getEvent().get(i).getProbability_away_team_winner() == chanseContainer.get(j)
                        || eventList.getEvent().get(i).getProbability_draw() == chanseContainer.get(j)
                        || eventList.getEvent().get(i).getProbability_home_team_winner() == chanseContainer.get(j)) {
                    mostProbableEvents.add(eventList.getEvent().get(i));
                }
            }
        }
//        ProbableResultMapper mapper = new ProbableResultMapper();
//        mapper.createProbableResultDto(mostProbableEvents);
         ProbableResultMapper.createProbableResultDto(mostProbableEvents);
    }




}


