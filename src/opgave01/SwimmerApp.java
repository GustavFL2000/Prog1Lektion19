package opgave01;

import java.util.ArrayList;
import opgave01.model.Swimmer;
import opgave01.model.TrainingPlan;

public class SwimmerApp {

    public static void main(String[] args) {

        ArrayList<Double> lapTimes = new ArrayList<>();
        lapTimes.add(1.02);
        lapTimes.add(1.01);
        lapTimes.add(0.99);
        lapTimes.add(0.98);
        lapTimes.add(1.02);
        lapTimes.add(1.04);
        lapTimes.add(0.99);
        Swimmer Jan = new Swimmer("Jan", 1994, lapTimes, "AGF");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.05);
        lapTimes.add(1.01);
        lapTimes.add(1.04);
        lapTimes.add(1.06);
        lapTimes.add(1.08);
        lapTimes.add(1.04);
        lapTimes.add(1.02);
        Swimmer Bo = new Swimmer("Bo", 1995, lapTimes, "Lyseng");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.03);
        lapTimes.add(1.01);
        lapTimes.add(1.02);
        lapTimes.add(1.05);
        lapTimes.add(1.03);
        lapTimes.add(1.06);
        lapTimes.add(1.03);
        Swimmer Mikkel = new Swimmer("Mikkel", 1993, lapTimes, "AIA-Tranbjerg");

        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(Jan);
        swimmers.add(Bo);
        swimmers.add(Mikkel);

        TrainingPlan tp1 = new TrainingPlan('A', 16, 10);
        TrainingPlan tp2 = new TrainingPlan('B', 10, 6);

        Jan.setTrainingPlan(tp1);
        Bo.setTrainingPlan(tp1);
        Mikkel.setTrainingPlan(tp2);

        for (Swimmer swimmer : swimmers) {
            System.out.println(swimmer.getName() + "'s bedste tid: " + swimmer.bestLapTime());
            System.out.println(swimmer.getName() + "'s træningsplan: " + swimmer.getTrainingPlan().getLevel());
            System.out.println(swimmer.getName() + "'s totale træningstid per uge: " + swimmer.allTrainingHoursPerWeek() + " timer");
        }

    }

}
