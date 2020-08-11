package ro.jademy.carrental.cars.dacia;

import ro.jademy.carrental.cars.Car;

public abstract class Dacia extends Car {


    public Dacia(String model, int rentCategory, int rentPricePerDay, int seatNumber, String fuelType, boolean isCarRented) {
        super("Dacia", model, rentCategory, rentPricePerDay, seatNumber, fuelType, isCarRented);
    }

}
