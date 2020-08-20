package ro.jademy.carrental.models.cars.mercedes;

import ro.jademy.carrental.models.cars.RentCategory;

public class AClass extends Mercedes {


    public AClass(int rentPricePerDay, int seatNumber, String fuelType, RentCategory rentCategory) {
        super("A Class", rentPricePerDay, seatNumber, fuelType, rentCategory);
    }
}
