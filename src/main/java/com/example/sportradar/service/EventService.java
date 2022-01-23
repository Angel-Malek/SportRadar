package com.example.sportradar.service;

import com.example.sportradar.dto.ProbableResultDto;
import com.example.sportradar.mapper.ProbableResultMapper;
import com.example.sportradar.model.Competitor;
import com.example.sportradar.model.Event;
import com.example.sportradar.model.EventList;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class EventService {

    public EventList eventList = new EventList();
    public Set<String> uniqueTeamNames = new HashSet<>();

    public EventService() {
        try {
            prepareEventData();
            uniqueTeamNames = getUniqueTeamNames(eventList.getEvent());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void prepareEventData() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(
                Objects.requireNonNull(getClass().getClassLoader().getResource("data.json")).getFile()
        );
        eventList = objectMapper.readValue(file, EventList.class);
        //  mostProbableEvents(eventListStore);
    }

    public List<ProbableResultDto> mostProbableEvents(long matchesCount) {
        List<Double> chanceContainer = new ArrayList<>();

        for (int i = 0; i < eventList.getEvent().size(); i++) {
            chanceContainer.add(eventList.getEvent().get(i).getProbability_home_team_winner());
            chanceContainer.add(eventList.getEvent().get(i).getProbability_draw());
            chanceContainer.add(eventList.getEvent().get(i).getProbability_away_team_winner());
        }

        Collections.sort(chanceContainer);
        Collections.reverse(chanceContainer);

        List<Event> mostProbableEvents = new ArrayList<>();

        for (int i = 0; i < eventList.getEvent().size(); i++) {
            for (int j = 0; j < matchesCount; j++) {
                if (eventList.getEvent().get(i).getProbability_away_team_winner().equals(chanceContainer.get(j))
                        || eventList.getEvent().get(i).getProbability_draw().equals(chanceContainer.get(j))
                        || eventList.getEvent().get(i).getProbability_home_team_winner().equals(chanceContainer.get(j))) {
                    mostProbableEvents.add(eventList.getEvent().get(i));
                }
            }
        }
        return ProbableResultMapper.createProbableResultDto(mostProbableEvents);
    }

    private Set<String> getUniqueTeamNames(List<Event> events) {
        Set<String> uniqueNamesSet = new HashSet<>();
        for (Event event : events) {
            for (Competitor competitor : event.getCompetitors()) {
                uniqueNamesSet.add(competitor.getName());
            }
        }
        return uniqueNamesSet;
    }

    public List<String> getUniqueTeamNamesByCompetition(String competitionName) {
        List<Event> events = eventList.getEvent().stream()
                .filter(event -> event.getCompetition_name().equals(competitionName)).collect(Collectors.toList());
        Set<String> uniqueTeamNames = getUniqueTeamNames(events);
        List<String> sortedList = new ArrayList<>(uniqueTeamNames);
        Collections.sort(sortedList);
        return sortedList;
    }

}
