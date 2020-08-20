package ro.jademy.carrental.models.cars.volkswagen;

import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.models.cars.RentCategory;

public abstract class Volkswagen extends Car {

    public Volkswagen(String model, int rentPricePerDay, int seatNumber, String fuelType, RentCategory rentCategory) {
        super("Volkswagen", model, rentPricePerDay, seatNumber, fuelType, rentCategory);
    }
}
