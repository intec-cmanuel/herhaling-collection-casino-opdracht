package be.intecbrussel.app;

import be.intecbrussel.model.SlotMachine;
import be.intecbrussel.view.Identifier;
import be.intecbrussel.view.Menu;

public class CasinoApp {
    public static void main(String[] args) {
        SlotMachine slotMachine = new SlotMachine();
        Identifier.IdentifyUser();
        while (true) {
            boolean userWantsToPlay = Menu.askIfUserWantsToPlay();

            if (userWantsToPlay) {
                slotMachine.playSlots();
            } else {
                break;
            }
        }
    }
}