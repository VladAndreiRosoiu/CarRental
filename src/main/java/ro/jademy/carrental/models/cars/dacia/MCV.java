package ro.jademy.carrental.models.cars.dacia;

public class MCV extends Dacia {

    public MCV(int rentCategory, int rentPricePerDay, int seatNumber, String fuelType, boolean isCarRented) {
        super("MCV", rentCategory, rentPricePerDay, seatNumber, fuelType, isCarRented);
    }
}
