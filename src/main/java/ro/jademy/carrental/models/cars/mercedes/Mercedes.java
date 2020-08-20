package ro.jademy.carrental.models.cars.mercedes;

import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.models.cars.RentCategory;

public abstract class Mercedes extends Car {

    public Mercedes(String model, int rentPricePerDay, int seatNumber, String fuelType, RentCategory rentCategory) {
        super("Mercedes", model, rentPricePerDay, seatNumber, fuelType, rentCategory);
    }
}
