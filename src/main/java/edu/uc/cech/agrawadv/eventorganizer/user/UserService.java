package edu.uc.cech.agrawadv.eventorganizer.user;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {
    public static HashMap<UUID, User> users = new HashMap<>();

    public static User findUser(UUID userId) {
        return users.get(userId);
    }

    public static Optional<User> findUserByUsername(String username) {
        return users
                .values()
                .stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();
    }

     public static void saveUser(User user) {
    	 //TODO
    }
     
     public List<User> findAll();
}
