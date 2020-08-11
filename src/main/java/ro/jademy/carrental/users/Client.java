package ro.jademy.carrental.users;

import ro.jademy.carrental.cars.Car;


import java.util.ArrayList;
import java.util.List;

public class Client extends User {

    private String licenceIssueDate;
    private int deposit;
    private List<Car> rentalHistory;

    public Client(String firstName, String lastName, String userName, String userPassword, String licenceIssueDate) {
        super(firstName, lastName, userName, userPassword);
        this.licenceIssueDate=licenceIssueDate;
        this.rentalHistory=new ArrayList<>();
    }

    public String getLicenceIssueDate() {
        return licenceIssueDate;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public List<Car> getRentalHistory() {
        return rentalHistory;
    }

    public void setRentalHistory(List<Car> rentalHistory) {
        this.rentalHistory = rentalHistory;
    }
}
