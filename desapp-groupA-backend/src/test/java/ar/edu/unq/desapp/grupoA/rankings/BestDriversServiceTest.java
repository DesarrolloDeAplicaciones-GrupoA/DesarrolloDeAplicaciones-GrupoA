package ar.edu.unq.desapp.grupoA.rankings;


import ar.edu.unq.desapp.grupoA.models.UserModel;
import ar.edu.unq.desapp.grupoA.repos.UserRepository;
import ar.edu.unq.desapp.grupoA.services.rankings.BestDriversService;
import ar.edu.unq.desapp.grupoA.testUtis.factories.UserModelTestFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class BestDriversServiceTest {

    private UserRepository userRepository;
    private BestDriversService service;

    @Before
    public void setUp() {
        this.userRepository = new UserRepository();
        this.service = new BestDriversService(this.userRepository);
        UserModelTestFactory factory = new UserModelTestFactory();
        this.userRepository.addUser(factory.getUserWithGoodScores(3));
        this.userRepository.addUser(factory.getUserWithGoodScores(2));
        this.userRepository.addUser(factory.getUserWithGoodScores(0));
    }

    @Test
    public void testReturnUseWithMoreGoodScores() {
        List<UserModel> users = this.service.allByScoring();
        assertEquals(3, users.get(0).getGoodDriverScores().size());
    }
}
