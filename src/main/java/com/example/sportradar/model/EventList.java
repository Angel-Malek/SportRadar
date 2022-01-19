package com.example.sportradar.model;

import java.util.List;

public class EventList {

    private List<Event> events;

    public EventList() {
    }

    public EventList(List<Event> events) {
        this.events = events;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "EventList{" +
                "events=" + events +
                '}';
    }
}
