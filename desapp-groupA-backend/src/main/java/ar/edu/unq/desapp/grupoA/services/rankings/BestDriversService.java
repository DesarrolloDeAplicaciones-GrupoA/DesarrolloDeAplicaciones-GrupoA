package ar.edu.unq.desapp.grupoA.services.rankings;

import ar.edu.unq.desapp.grupoA.models.UserModel;
import ar.edu.unq.desapp.grupoA.repos.UserRepository;

import java.util.List;
import java.util.stream.Collectors;


public class BestDriversService {
    private UserRepository userRepository;

    public BestDriversService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserModel> allByScoring() {
        return this.userRepository.all().stream().sorted((first, second) -> second.getDriverScores().size() - first.getDriverScores().size()).collect(Collectors.toList());
    }
}
