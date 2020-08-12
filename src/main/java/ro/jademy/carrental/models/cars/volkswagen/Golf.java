package ro.jademy.carrental.models.cars.volkswagen;

public class Golf extends Volkswagen {

    public Golf(int rentCategory, int rentPricePerDay, int seatNumber, String fuelType, boolean isCarRented) {
        super("Golf", rentCategory, rentPricePerDay, seatNumber, fuelType, isCarRented);
    }
}
