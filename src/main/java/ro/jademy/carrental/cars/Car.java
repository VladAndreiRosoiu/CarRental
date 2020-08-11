package ro.jademy.carrental.cars;


public  abstract class Car {
    private String UUID;
    private String make;
    private String model;
    private int rentCategory;
    private int rentPricePerDay;
    private int seatNumber;
    private String fuelType;
    private boolean isCarRented;

    public Car(String make, String model, int rentCategory, int rentPricePerDay, int seatNumber, String fuelType, boolean isCarRented) {
        this.UUID= java.util.UUID.randomUUID().toString();
        this.make = make;
        this.model = model;
        this.rentCategory = rentCategory;
        this.rentPricePerDay = rentPricePerDay;
        this.seatNumber = seatNumber;
        this.fuelType = fuelType;
        this.isCarRented=isCarRented;
    }

    public String getUUID() {
        return UUID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRentCategory() {
        return rentCategory;
    }

    public void setRentCategory(int rentCategory) {
        this.rentCategory = rentCategory;
    }

    public int getRentPricePerDay() {
        return rentPricePerDay;
    }

    public void setRentPricePerDay(int rentPricePerDay) {
        this.rentPricePerDay = rentPricePerDay;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isCarRented() {
        return isCarRented;
    }

    public void setCarRented(boolean carRented) {
        isCarRented = carRented;
    }

    @Override
    public String toString() {
        return "Make: "+make+
                ", Model: " + model+
                ", rent category "+rentCategory+
                ", having a standard rent price per day of "+rentPricePerDay;
    }
}
