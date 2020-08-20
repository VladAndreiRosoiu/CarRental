package ro.jademy.carrental.models.cars.mercedes;

import ro.jademy.carrental.models.cars.RentCategory;

public class CClass extends Mercedes {
    public CClass(int rentPricePerDay, int seatNumber, String fuelType, RentCategory rentCategory) {
        super("C Class", rentPricePerDay, seatNumber, fuelType, rentCategory);
    }
}
