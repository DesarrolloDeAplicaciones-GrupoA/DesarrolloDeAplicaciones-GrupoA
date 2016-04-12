package ar.edu.unq.desapp.grupoA.testUtis.factories;

import ar.edu.unq.desapp.grupoA.models.Score;
import ar.edu.unq.desapp.grupoA.models.Travel;

public class ScoreFactory {

    public Score goodDriver() {
        Travel travel = new TravelTestFactory().getTravelTest();
        return new Score(travel, true);
    }
}
