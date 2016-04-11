package ar.edu.unq.desapp.grupoA.services.scoring;


import ar.edu.unq.desapp.grupoA.models.Score;
import ar.edu.unq.desapp.grupoA.models.Travel;
import ar.edu.unq.desapp.grupoA.models.UserModel;

public class AccompanistScoreService extends BaseScoreService<UserModel> {

    @Override
    protected void addScore(UserModel accompanist, Score score) {
        accompanist.addAccompanistScore(score);
    }
}