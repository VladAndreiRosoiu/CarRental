package ro.jademy.carrental.models;

import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.models.users.Client;

import java.time.LocalDate;


public class RentedCar {

    private Car rentedCar;
    private Client client;
    private LocalDate rentDate;
    private LocalDate returnDate;
    private int finalTotalRentPrice;

    public RentedCar() {
    }

    public RentedCar(Car rentedCar, Client client, int finalTotalRentPrice, LocalDate rentDate, LocalDate returnDate) {
        this.rentedCar = rentedCar;
        this.client = client;
        this.finalTotalRentPrice = finalTotalRentPrice;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
    }

    public Car getRentedCar() {
        return rentedCar;
    }

    public void setRentedCar(Car rentedCar) {
        this.rentedCar = rentedCar;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getFinalTotalRentPrice() {
        return finalTotalRentPrice;
    }

    public void setFinalTotalRentPrice(int finalTotalRentPrice) {
        this.finalTotalRentPrice = finalTotalRentPrice;
    }
}
