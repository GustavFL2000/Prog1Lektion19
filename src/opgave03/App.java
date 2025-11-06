package opgave03;

import opgave03.model.Car;
import opgave03.model.Rental;

public class App {

    public static void main(String[] args) {
        //Opret 5 biler
        Car car1 = new Car("AB12345", 2018);
        Car car2 = new Car("CD67890", 2020);
        Car car3 = new Car("EF11223", 2019);
        Car car4 = new Car("GH44556", 2021);
        Car car5 = new Car("IJ77889", 2017);

        //2 udlejninger af et antal af de fem biler.
        //Udlejning 1
        Rental rental1 = new opgave03.model.Rental(1, 5, "2024-06-01");
        Rental rental2 = new opgave03.model.Rental(2, 3, "2024-06-10");

        rental1.addCars(car1);
        rental1.addCars(car2);
        rental2.addCars(car3);
        rental2.addCars(car4);
        rental2.addCars(car5);

        car1.setDayPrice(100);
        car2.setDayPrice(200);
        car3.setDayPrice(200);
        System.out.println(rental1.getPrice());

    }
}
