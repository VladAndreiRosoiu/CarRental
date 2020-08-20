package ro.jademy.carrental.models.cars.dacia;

import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.models.cars.RentCategory;

public abstract class Dacia extends Car {


    public Dacia(String model, int rentPricePerDay, int seatNumber, String fuelType, RentCategory rentCategory) {
        super("Dacia", model, rentPricePerDay, seatNumber, fuelType, rentCategory);
    }

}
