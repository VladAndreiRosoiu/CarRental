package ro.jademy.carrental.models.users;

import ro.jademy.carrental.models.RentedCar;
import ro.jademy.carrental.models.cars.Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client extends User {

    private LocalDate licenceIssueDate;
    private int deposit;
    private Car currentlyRentedCar;
    private List<RentedCar> rentalHistory;

    public Client(String firstName, String lastName, String userName, String userPassword, LocalDate licenceIssueDate) {
        super(firstName, lastName, userName, userPassword);
        this.licenceIssueDate = licenceIssueDate;
        this.rentalHistory = new ArrayList<>();
    }

    public LocalDate getLicenceIssueDate() {
        return licenceIssueDate;
    }

    public void setLicenceIssueDate(LocalDate licenceIssueDate) {
        this.licenceIssueDate = licenceIssueDate;
    }


    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public List<RentedCar> getRentalHistory() {
        return rentalHistory;
    }

    public void setRentalHistory(List<RentedCar> rentalHistory) {
        this.rentalHistory = rentalHistory;
    }


    public Car getCurrentlyRentedCar() {
        return currentlyRentedCar;
    }

    public void setCurrentlyRentedCar(Car currentlyRentedCar) {
        this.currentlyRentedCar = currentlyRentedCar;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }
}
