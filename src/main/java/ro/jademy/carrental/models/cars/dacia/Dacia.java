package ro.jademy.carrental.models.cars.dacia;

import ro.jademy.carrental.models.cars.Car;

public abstract class Dacia extends Car {


    public Dacia(String model, int rentCategory, int rentPricePerDay, int seatNumber, String fuelType) {
        super("Dacia", model, rentCategory, rentPricePerDay, seatNumber, fuelType);
    }

}
