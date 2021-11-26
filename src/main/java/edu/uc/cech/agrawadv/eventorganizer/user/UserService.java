package edu.uc.cech.agrawadv.eventorganizer.user;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findUser(int userId);
    Optional<User> findUserByUsername(String username);
    void saveUser(User user);
    List<User> findAll();
}
