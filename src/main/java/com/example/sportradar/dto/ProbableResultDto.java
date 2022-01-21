package com.example.sportradar.dto;

public class ProbableResultDto {

    private String startDate;
    private String competitionName;
    private String competitorHomeName;
    private String competitorHomeCountry;
    private String competitorAwayName;
    private String competitorAwayCountry;
    private String venueName;
    private String highestProbableResultName;
    private Double highestProbableResultValue;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getCompetitorHomeName() {
        return competitorHomeName;
    }

    public void setCompetitorHomeName(String competitorHomeName) {
        this.competitorHomeName = competitorHomeName;
    }

    public String getCompetitorHomeCountry() {
        return competitorHomeCountry;
    }

    public void setCompetitorHomeCountry(String competitorHomeCountry) {
        this.competitorHomeCountry = competitorHomeCountry;
    }

    public String getCompetitorAwayName() {
        return competitorAwayName;
    }

    public void setCompetitorAwayName(String competitorAwayName) {
        this.competitorAwayName = competitorAwayName;
    }

    public String getCompetitorAwayCountry() {
        return competitorAwayCountry;
    }

    public void setCompetitorAwayCountry(String competitorAwayCountry) {
        this.competitorAwayCountry = competitorAwayCountry;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getHighestProbableResultName() {
        return highestProbableResultName;
    }

    public void setHighestProbableResultName(String highestProbableResultName) {
        this.highestProbableResultName = highestProbableResultName;
    }

    public Double getHighestProbableResultValue() {
        return highestProbableResultValue;
    }

    public void setHighestProbableResultValue(Double highestProbableResultValue) {
        this.highestProbableResultValue = highestProbableResultValue;
    }

    @Override
    public String toString() {
        return "ProbableResultDto{" +
                "startDate='" + startDate + '\'' +
                ", competitionName='" + competitionName + '\'' +
                ", competitorHomeName='" + competitorHomeName + '\'' +
                ", competitorHomeCountry='" + competitorHomeCountry + '\'' +
                ", competitorAwayName='" + competitorAwayName + '\'' +
                ", competitorAwayCountry='" + competitorAwayCountry + '\'' +
                ", venueName='" + venueName + '\'' +
                ", highestProbableResultName='" + highestProbableResultName + '\'' +
                ", highestProbableResultValue=" + highestProbableResultValue +
                '}';
    }
}
