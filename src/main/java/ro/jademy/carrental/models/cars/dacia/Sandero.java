package ro.jademy.carrental.models.cars.dacia;

public class Sandero extends Dacia {

    public Sandero(int rentCategory, int rentPricePerDay, int seatNumber, String fuelType, boolean isCarRented) {
        super("Sandero", rentCategory, rentPricePerDay, seatNumber, fuelType, isCarRented);
    }
}
