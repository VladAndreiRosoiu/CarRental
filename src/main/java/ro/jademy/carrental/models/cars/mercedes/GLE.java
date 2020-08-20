package ro.jademy.carrental.models.cars.mercedes;

import ro.jademy.carrental.models.cars.RentCategory;

public class GLE extends Mercedes {

    public GLE(int rentPricePerDay, int seatNumber, String fuelType, RentCategory rentCategory) {
        super("GLE", rentPricePerDay, seatNumber, fuelType, rentCategory);
    }
}
