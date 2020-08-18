package ro.jademy.carrental.services;

import ro.jademy.carrental.models.RentedCar;
import ro.jademy.carrental.models.users.Client;
import ro.jademy.carrental.models.users.User;

import java.util.List;

public interface StatisticsService {

    int calculateCurrentIncome(List<RentedCar> currentlyRented);

    int calculateHighestIncomeGenerated(List<User> users);

    void doMostRentedCar(List<Client> clients);

    void doClientWithMostRentals(List<Client> clients);
}
