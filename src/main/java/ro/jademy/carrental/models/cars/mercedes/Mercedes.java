package ro.jademy.carrental.models.cars.mercedes;

import ro.jademy.carrental.models.cars.Car;

public abstract class Mercedes extends Car {

    public Mercedes(String model, int rentCategory, int rentPricePerDay, int seatNumber, String fuelType, boolean isCarRented) {
        super("Mercedes", model, rentCategory, rentPricePerDay, seatNumber, fuelType, isCarRented);
    }
}
