package opgave04;

import opgave04.model.Swimmer;
import opgave04.model.TrainingPlan;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    //Check at linkmetoderne virker ved at udskrive svømmerne på træningsplanobjektet
    public static void main(String[] args) {
        TrainingPlan planA = new TrainingPlan('A', 10, 5);

        Swimmer swimmer1 = planA.createSwimmer("Alice", 2005, new ArrayList<>(Arrays.asList(55.2, 54.8, 56.1)), "Sharks");
        Swimmer swimmer2 = planA.createSwimmer("Bob", 2004, new ArrayList<>(Arrays.asList(52.3, 53.5, 51.9)), "Dolphins");

        // Display swimmers in Training Plan A
        for (Swimmer swimmer : planA.getSwimmers()) {
            System.out.println("Swimmer Name: " + swimmer.getName() + ", Club: " + swimmer.getClub() + ", Best Lap Time: " + swimmer.bestLapTime());
    }}
}
