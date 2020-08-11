package ro.jademy.carrental.users;

import ro.jademy.carrental.cars.Car;

public class Client extends User {

    private String licenceIssueDate;
    private int deposit;
    private Car rentedCar;

    public Client(String firstName, String lastName, String userName, String userPassword, String licenceIssueDate) {
        super(firstName, lastName, userName, userPassword);
        this.licenceIssueDate=licenceIssueDate;
    }

    public String getLicenceIssueDate() {
        return licenceIssueDate;
    }

    public void setLicenceIssueDate(String licenceIssueDate) {
        this.licenceIssueDate=licenceIssueDate;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public Car getRentedCar() {
        return rentedCar;
    }

    public void setRentedCar(Car rentedCar) {
        this.rentedCar = rentedCar;
    }
}
