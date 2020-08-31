package be.intecbrussel.view;

import java.util.Scanner;

public class Menu {
    private static Scanner keyboard = new Scanner(System.in);

    public static boolean askIfUserWantsToPlay() {
        while (true) {
            System.out.println("Do you want to play the slotmachine? yes or no");
            String userAnswer = keyboard.nextLine();

            if (userAnswer.equalsIgnoreCase("yes")) {
                return true;
            } else if (userAnswer.equalsIgnoreCase("no")) {
                return false;
            } else {
                System.out.println("Please input yes or no.");
            }
        }
    }
}