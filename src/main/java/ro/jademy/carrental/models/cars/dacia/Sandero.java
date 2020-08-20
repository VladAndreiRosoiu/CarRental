package ro.jademy.carrental.models.cars.dacia;

import ro.jademy.carrental.models.cars.RentCategory;

public class Sandero extends Dacia {

    public Sandero(int rentPricePerDay, int seatNumber, String fuelType, RentCategory rentCategory) {
        super("Sandero", rentPricePerDay, seatNumber, fuelType, rentCategory);
    }
}
