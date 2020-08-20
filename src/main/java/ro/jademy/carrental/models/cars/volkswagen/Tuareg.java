package ro.jademy.carrental.models.cars.volkswagen;

import ro.jademy.carrental.models.cars.RentCategory;

public class Tuareg extends Volkswagen {

    public Tuareg(int rentPricePerDay, int seatNumber, String fuelType, RentCategory rentCategory) {
        super("Tuareg", rentPricePerDay, seatNumber, fuelType, rentCategory);
    }
}
