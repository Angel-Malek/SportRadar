package com.example.sportradar.model;

import java.util.List;

public class Event {
    private String sport_event_id;
    private String start_date;
    private String sport_name;
    private String competition_name;
    private String competition_id;
    private String season_name;

    private List<Competitor> competitors;
    private Venue venue;

    private Double probability_home_team_winner;
    private Double probability_draw;
    private Double probability_away_team_winner;

    public Event() {
    }

    public Event(String sport_event_id, String start_date, String sport_name, String competition_name, String competition_id, String season_name, List<Competitor> competitors, Venue venue, Double probability_home_team_winner, Double probability_draw, Double probability_away_team_winner) {
        this.sport_event_id = sport_event_id;
        this.start_date = start_date;
        this.sport_name = sport_name;
        this.competition_name = competition_name;
        this.competition_id = competition_id;
        this.season_name = season_name;
        this.competitors = competitors;
        this.venue = venue;
        this.probability_home_team_winner = probability_home_team_winner;
        this.probability_draw = probability_draw;
        this.probability_away_team_winner = probability_away_team_winner;
    }

    public String getSport_event_id() {
        return sport_event_id;
    }

    public void setSport_event_id(String sport_event_id) {
        this.sport_event_id = sport_event_id;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getSport_name() {
        return sport_name;
    }

    public void setSport_name(String sport_name) {
        this.sport_name = sport_name;
    }

    public String getCompetition_name() {
        return competition_name;
    }

    public void setCompetition_name(String competition_name) {
        this.competition_name = competition_name;
    }

    public String getCompetition_id() {
        return competition_id;
    }

    public void setCompetition_id(String competition_id) {
        this.competition_id = competition_id;
    }

    public String getSeason_name() {
        return season_name;
    }

    public void setSeason_name(String season_name) {
        this.season_name = season_name;
    }

    public List<Competitor> getCompetitors() {
        return competitors;
    }

    public void setCompetitors(List<Competitor> competitors) {
        this.competitors = competitors;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Double getProbability_home_team_winner() {
        return probability_home_team_winner;
    }

    public void setProbability_home_team_winner(Double probability_home_team_winner) {
        this.probability_home_team_winner = probability_home_team_winner;
    }

    public Double getProbability_draw() {
        return probability_draw;
    }

    public void setProbability_draw(Double probability_draw) {
        this.probability_draw = probability_draw;
    }

    public Double getProbability_away_team_winner() {
        return probability_away_team_winner;
    }

    public void setProbability_away_team_winner(Double probability_away_team_winner) {
        this.probability_away_team_winner = probability_away_team_winner;
    }

    @Override
    public String toString() {
        return "Event{" +
                "sport_event_id='" + sport_event_id + '\'' +
                ", start_date='" + start_date + '\'' +
                ", sport_name='" + sport_name + '\'' +
                ", competition_name='" + competition_name + '\'' +
                ", competition_id='" + competition_id + '\'' +
                ", season_name='" + season_name + '\'' +
                ", competitors=" + competitors +
                ", venue=" + venue +
                ", probability_home_team_winner=" + probability_home_team_winner +
                ", probability_draw=" + probability_draw +
                ", probability_away_team_winner=" + probability_away_team_winner +
                '}';
    }
}
