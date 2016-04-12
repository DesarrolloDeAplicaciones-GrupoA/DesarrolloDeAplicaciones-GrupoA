package ar.edu.unq.desapp.grupoA.repos;

import ar.edu.unq.desapp.grupoA.models.UserModel;
import ar.edu.unq.desapp.grupoA.testUtis.factories.UserModelTestFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class UserRepositoryTest {

    private UserRepository repository;

    @Before
    public void setUp() {
        this.repository = new UserRepository();
    }

    @Test
    public void testIncreaseUsersCount() {
        this.repository.addUser(new UserModelTestFactory().getUser());
        assertEquals(1, this.repository.count());
    }

    @Test
    public void testReturnAllUsers() {
        UserModel user = new UserModelTestFactory().getUser();
        this.repository.addUser(user);
        List<UserModel> users = this.repository.all();
        assertEquals(users.get(0), user);
        assertEquals(1, users.size());
    }
}
