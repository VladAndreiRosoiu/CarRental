package ro.jademy.carrental.models.cars.mercedes;

public class CClass extends Mercedes {
    public CClass(int rentCategory, int rentPricePerDay, int seatNumber, String fuelType, boolean isCarRented) {
        super("C Class", rentCategory, rentPricePerDay, seatNumber, fuelType, isCarRented);
    }
}
