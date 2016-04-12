package ar.edu.unq.desapp.grupoA.repos;

import ar.edu.unq.desapp.grupoA.models.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<UserModel> users;

    public UserRepository() {
        this.users = new ArrayList<>();
    }

    public void addUser(UserModel user) {
        this.users.add(user);
    }

    public int count() {
        return this.users.size();
    }
}
