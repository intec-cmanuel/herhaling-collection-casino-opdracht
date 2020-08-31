package be.intecbrussel.view;

import java.util.Scanner;

import be.intecbrussel.config.SessionSettings;
import be.intecbrussel.data.PasswordRepository;
import be.intecbrussel.data.UserRepository;
import be.intecbrussel.model.User;

public class Identifier {
    private static Scanner keyboard = new Scanner(System.in);
    private static PasswordRepository passwordRepository = PasswordRepository.getPasswordRepository();
    private static UserRepository userRepository = UserRepository.getUserRepository();

    public static void IdentifyUser() {
        User user;
        while (true) {
            System.out.println("Hello user! Do you want to [login] or to [register]?");
            String userAnswer = keyboard.nextLine();

            if (userAnswer.equalsIgnoreCase("login")) {
                user = logIn();
                break;
            } else if (userAnswer.equalsIgnoreCase("register")) {
                user = register();
                break;
            } else {
                System.out.println("Please use login or register");
            }
        }

        SessionSettings.currentUser = user;
    }

    private static User register() {
        while (true) {
            System.out.println("What is your Username?");
            String username = keyboard.nextLine();
            System.out.println("What is your password?");
            String password = keyboard.nextLine();
            System.out.println("Please confirm your password");
            String confirmedPassword = keyboard.nextLine();

            if (password.equals(confirmedPassword)) {
                boolean alreadyExists = passwordRepository.checkIfUsernameAlreadyExists(username);

                if (alreadyExists) {
                    System.out.println("This username already exists");
                } else {
                    userRepository.addUser(username);
                    passwordRepository.addPassword(username, password);
                    return userRepository.getUser(username);
                }

            } else {
                System.out.println("Password is not the same as confirmed password.");
            }
        }
    }

    private static User logIn() {
        while (true) {
            System.out.println("What is your Username?");
            String username = keyboard.nextLine();
            System.out.println("What is your password?");
            String password = keyboard.nextLine();

            boolean isValid = passwordRepository.checkValidUsernamePassword(username, password);

            if (isValid) {
                return userRepository.getUser(username);
            } else {
                System.out.println("Username and password combination does not exist");
            }
        }
    }
}