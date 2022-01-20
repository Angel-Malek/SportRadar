package com.example.sportradar.model;

import java.util.List;

public class EventList {

    private List<Event> event;

    public EventList() {
    }

    public EventList(List<Event> events) {
        this.event = events;
    }

    public List<Event> getEvent() {
        return event;
    }

    public void setEvents(List<Event> events) {
        this.event = events;
    }

    @Override
    public String toString() {
        return "EventList{" +
                "events=" + event +
                '}';
    }
}
