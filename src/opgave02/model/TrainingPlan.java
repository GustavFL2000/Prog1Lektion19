package opgave02.model;

import java.util.ArrayList;

/**
 * Models a training plan for a Swimmer
 */
public class TrainingPlan {

    private char level;
    private int weeklyWaterHours;
    private int weeklyStrengthHours;

    //association --> 0..* Swimmer
    private final ArrayList<Swimmer> swimmers = new ArrayList<>();

    public ArrayList<Swimmer> getSwimmers() {
        return new ArrayList<>(swimmers);
    }

    public void addSwimmer(Swimmer swimmer) {
        if (!swimmers.contains(swimmer)) {
            swimmers.add(swimmer);
        }
    }

    public void removeSwimmer(Swimmer swimmer) {
        if (!swimmers.contains(swimmer)) {
            swimmers.remove(swimmer);
        }
    }

    /**
     * Initialize a new training plan with level, weeklyWaterHours, and
     * weeklyStrengthHours.
     */
    public TrainingPlan(char level, int weeklyWaterHours, int weeklyStrengthHours) {
        this.level = level;
        this.weeklyWaterHours = weeklyWaterHours;
        this.weeklyStrengthHours = weeklyStrengthHours;
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char niveau) {
        this.level = niveau;
    }

    public int getWeeklyStrengthHours() {
        return weeklyStrengthHours;
    }

    public void setWeeklyStrengthHours(int weeklyStrengthHours) {
        this.weeklyStrengthHours = weeklyStrengthHours;
    }

    public int getWeeklyWaterHours() {
        return weeklyWaterHours;
    }

    public void setWeeklyWaterHours(int weeklyWaterHours) {
        this.weeklyWaterHours = weeklyWaterHours;
    }

    public void printSwimmers() {
        System.out.println("Training Plan A Swimmers:");
        for (Swimmer swimmer : getSwimmers()) {
            System.out.println("- " + swimmer.getName() + " From year group " + swimmer.getYearGroup() + " from the club " + swimmer.getClub());
        }
    }

}
