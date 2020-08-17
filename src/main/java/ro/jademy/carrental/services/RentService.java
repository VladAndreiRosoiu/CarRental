package ro.jademy.carrental.services;

import ro.jademy.carrental.models.RentedCar;
import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.models.users.Client;

import java.time.LocalDate;
import java.util.List;

public interface RentService {

    boolean validateDriverLicence(Client client, Car car);

    boolean validateDepositForRent(Client client, Car car);

    void rentCar(List<Car> carList, Client client, Car car);

    int calculateFinalRentPrice(Car car, int nrOfDays);

    RentedCar rentedCar(Car car, Client client, int rentPrice, LocalDate pickUpDate, LocalDate returnDate);

    boolean validatePayedAmount(int payed, List<RentedCar> currentlyRented, Client client);

    void returnRentedCar(List<Car> carList, List<RentedCar> currentlyRentedCars, Client client);
}
