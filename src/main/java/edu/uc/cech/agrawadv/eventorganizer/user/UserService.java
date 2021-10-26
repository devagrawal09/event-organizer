package edu.uc.cech.agrawadv.eventorganizer.user;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

public class UserService {
    private HashMap<UUID, User> users = new HashMap<>();

    User findUser(UUID userId) {
        return users.get(userId);
    }

    Optional<User> findUserByUsername(String username) {
        return users
                .values()
                .stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();
    }

    void saveUser(User user) {
        users.put(user.getUserId(), user);
    }
}
