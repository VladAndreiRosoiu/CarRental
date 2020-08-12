package ro.jademy.carrental.models.cars.volkswagen;

import ro.jademy.carrental.models.cars.Car;

public abstract class Volkswagen extends Car {

    public Volkswagen(String model, int rentCategory, int rentPricePerDay, int seatNumber, String fuelType, boolean isCarRented) {
        super("Volkswagen", model, rentCategory, rentPricePerDay, seatNumber, fuelType, isCarRented);
    }
}
