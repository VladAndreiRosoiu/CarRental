package ro.jademy.carrental.models.cars.volkswagen;

import ro.jademy.carrental.models.cars.RentCategory;

public class Touran extends Volkswagen {

    public Touran(int rentPricePerDay, int seatNumber, String fuelType, RentCategory rentCategory) {
        super("Touran", rentPricePerDay, seatNumber, fuelType, rentCategory);
    }
}
