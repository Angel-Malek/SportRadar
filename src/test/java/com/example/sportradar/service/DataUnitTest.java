package com.example.sportradar.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DataUnitTest {

    @Test
    void shouldGetData() {
        EventService eventService = new EventService();
        assertNotNull(eventService.eventList);
    }
}
