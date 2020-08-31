package be.intecbrussel.data;

import java.util.List;

import be.intecbrussel.model.User;

public class UserRepository {
    // SINGLETON CLASS
    private static UserRepository userRepository = new UserRepository();

    private UserRepository() {

    }

    public static UserRepository getUserRepository() {
        return userRepository;
    }
    // END SINGLETON PART

    private List<User> users;

    public void addUser(String username) {

    }

    public User getUser(String username) {
        return null;
    }

    public void removeUser() {

    }
}