package ro.jademy.carrental.models.cars.volkswagen;

import ro.jademy.carrental.models.cars.RentCategory;

public class Golf extends Volkswagen {

    public Golf(int rentPricePerDay, int seatNumber, String fuelType, RentCategory rentCategory) {
        super("Golf", rentPricePerDay, seatNumber, fuelType, rentCategory);
    }
}
