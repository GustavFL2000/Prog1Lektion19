package opgave02;

import java.util.ArrayList;
import opgave02.model.Swimmer;
import opgave02.model.TrainingPlan;

public class SwimmerApp {

    public static void main(String[] args) {

        Swimmer swimmer1 = new Swimmer("Alice", 2005, new ArrayList<>(), "Sharks");
        Swimmer swimmer2 = new Swimmer("Bob", 2004, new ArrayList<>(), "Dolphins");

        TrainingPlan planA = new TrainingPlan('A', 10, 5);

        planA.addSwimmer(swimmer1);
        planA.addSwimmer(swimmer2);

        // Display swimmers in Training Plan A
        planA.printSwimmers();
    }

}
