package be.intecbrussel.data;

import java.util.Map;

public class PasswordRepository {
    // SINGLETON DESIGN PATTERN
    private static PasswordRepository passwordRepository = new PasswordRepository();

    private PasswordRepository() {

    }

    public static PasswordRepository getPasswordRepository() {
        return passwordRepository;
    }
    // END SINGLETON PART

    // Key: username. Value: password
    private Map<String, String> passwords;

    public void addPassword(String username, String password) {

    }

    public void getPassword() {

    }

    public void removePassword() {

    }

    public void replacePassword() {

    }

    public boolean checkValidUsernamePassword(String username, String password) {

    }

    public boolean checkIfUsernameAlreadyExists(String username) {

    }
}