package ro.jademy.carrental.models.cars.dacia;

import ro.jademy.carrental.models.cars.RentCategory;

public class Logan extends Dacia {

    public Logan(int rentPricePerDay, int seatNumber, String fuelType, RentCategory rentCategory) {
        super("Logan", rentPricePerDay, seatNumber, fuelType, rentCategory);
    }

}
