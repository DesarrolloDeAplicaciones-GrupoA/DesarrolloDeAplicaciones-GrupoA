package ar.edu.unq.desapp.grupoA.testUtis.factories;

import ar.edu.unq.desapp.grupoA.models.UserModel;
import net.java.quickcheck.ExtendibleGenerator;
import net.java.quickcheck.generator.PrimitiveGenerators;


public class UserModelTestFactory {

    private UserModel user;
    private ExtendibleGenerator<Character, String> nameGenerator = PrimitiveGenerators.strings();
    private ExtendibleGenerator<Character, String> addressGenerator = PrimitiveGenerators.nonEmptyStrings();

    public UserModel getUser() {
        String name = nameGenerator.next();
        String emailAddress = addressGenerator.next();
        return (new UserModel(name, emailAddress + "@example.com"));
    }

    public UserModel getUserWithGoodScores(Integer goodScoresCount) {
        UserModel user = this.getUser();
        for (int i = 0; i < goodScoresCount; i++) {
            user.addDriverScore(new ScoreFactory().goodDriver());
        }
        return user;
    }
}
