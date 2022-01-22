package com.example.sportradar.controller;

import com.example.sportradar.dto.ProbableResultDto;
import com.example.sportradar.model.EventList;
import com.example.sportradar.service.EventService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "/event")
public class EventController {
    private EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public EventList getAllEventsData() {
        return eventService.eventList;
    }

    @GetMapping(value = "/mostProbable/{matchesCount}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProbableResultDto> getMostProbableEvents(@PathVariable("matchesCount") long matchesCount) {
        if (matchesCount > eventService.eventList.getEvent().size()) {
            throw new RuntimeException("To big value");
        }
        return eventService.mostProbableEvents(matchesCount);
    }

    @GetMapping(value = "/uniqueNames", produces = MediaType.APPLICATION_JSON_VALUE)
    public Set<String> getUniqueTeamName() {
        return eventService.uniqueTeamNames;
    }

    @GetMapping(value = "/uniqueTeamNames/{competitionName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getUniqueTeamNames(@PathVariable("competitionName") String competitionName) {
        return eventService.getUniqueTeamNamesByCompetition(competitionName);
    }

}
