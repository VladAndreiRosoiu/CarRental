package ro.jademy.carrental.models.cars.dacia;

import ro.jademy.carrental.models.cars.RentCategory;

public class MCV extends Dacia {

    public MCV(int rentPricePerDay, int seatNumber, String fuelType, RentCategory rentCategory) {
        super("MCV", rentPricePerDay, seatNumber, fuelType, rentCategory);
    }
}
