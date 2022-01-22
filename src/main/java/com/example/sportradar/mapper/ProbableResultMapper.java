package com.example.sportradar.mapper;

import com.example.sportradar.dto.ProbableResultDto;
import com.example.sportradar.model.Competitor;
import com.example.sportradar.model.Event;

import java.util.ArrayList;
import java.util.List;

public class ProbableResultMapper {

    private final static String QUALIFIER_HOME = "home";
    private final static String QUALIFIER_AWAY = "away";
    private final static String HOME_TEAM_WIN = "HOME_TEAM_WIN";
    private final static String DRAW = "DRAW";
    private final static String AWAY_TEAM_WIN = "AWAY_TEAM_WIN";

    public static List<ProbableResultDto> createProbableResultDto(List<Event> eventList) {

        List<ProbableResultDto> probableResultDtoList = new ArrayList<>();

        for (Event event : eventList) {
            ProbableResultDto probableResultDto = new ProbableResultDto();
            probableResultDto.setStartDate(event.getStart_date());
            probableResultDto.setCompetitionName(event.getCompetition_name());

            probableResultDto.setCompetitorHomeName(getCompetitorName(event.getCompetitors(), QUALIFIER_HOME));
            probableResultDto.setCompetitorHomeCountry(getCompetitorCountry(event.getCompetitors(), QUALIFIER_HOME));

            probableResultDto.setCompetitorAwayName(getCompetitorName(event.getCompetitors(), QUALIFIER_AWAY));
            probableResultDto.setCompetitorAwayCountry(getCompetitorCountry(event.getCompetitors(), QUALIFIER_AWAY));

            probableResultDtoList.add(probableResultDto);
            probableResultDto.setVenueName(event.getVenue().getName());

            probableResultDto.setHighestProbableResultValue(getHighestProbableResultValue(event));
            probableResultDto.setHighestProbableResultName(getHighestProbableResultName(event));

        }
      return  probableResultDtoList;
    }

    private static String getCompetitorName(List<Competitor> competitors, String place) {
        String result = "";
        for (Competitor competitor : competitors) {
            if (competitor.getQualifier().equals(place)) {

                result = competitor.getName();
            }

        }
        return result;
    }

    private static String getCompetitorCountry(List<Competitor> competitors, String place) {
        String result = "";
        for (Competitor competitor : competitors) {
            if (competitor.getQualifier().equals(place)) {
                result = competitor.getCountry();
            }

        }
        return result;
    }

    private static Double getHighestProbableResultValue(Event event) {
        Double result = Math.max(
                Math.max(event.getProbability_home_team_winner(), event.getProbability_draw()),
                event.getProbability_away_team_winner());
        return result;
    }

    private static String getHighestProbableResultName(Event event) {
        String resultName = "";
        Double resultScore = getHighestProbableResultValue(event);

        if (resultScore.equals(event.getProbability_away_team_winner())) {
            resultName = AWAY_TEAM_WIN;
        } else if (resultScore.equals(event.getProbability_draw())) {
            resultName = DRAW;
        } else if (resultScore.equals(event.getProbability_home_team_winner())) {
            resultName = HOME_TEAM_WIN;
        }
        return resultName;
    }


}
