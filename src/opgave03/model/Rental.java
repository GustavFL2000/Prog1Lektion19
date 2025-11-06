package opgave03.model;

import java.util.ArrayList;

public class Rental {

    private int number;
    private int days;
    private String date;
    private final ArrayList<Car> cars = new ArrayList<Car>();

    public Rental(int number, int days, String date) {
        this.number = number;
        this.days = days;
        this.date = date;
    }

    public ArrayList<Car> getCars() {
        return new ArrayList<>(cars);
    }

    public void addCars(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        if (cars.contains(car)) {
            cars.remove(car);
        }
    }

    public double getPrice() {
        double price = 0;
        for (Car car : cars) {
            price += car.getDayPrice();
        }
        return price * getDays();
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return this.days;
    }

}
