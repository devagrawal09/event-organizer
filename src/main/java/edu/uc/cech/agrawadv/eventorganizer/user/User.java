package edu.uc.cech.agrawadv.eventorganizer.user;

import java.util.UUID;

public class User {
    private UUID userId;
    private String name;
    private String username;
    private String password;
    private String role;

    public User(String name, String username, String password, String role) {
        this.userId = UUID.randomUUID();
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public User(UUID userId, String name, String username, String password, String role) {
        this.userId = userId;
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public Boolean checkPassword(String attempt) {
        return password.equals(attempt);
    }
}
