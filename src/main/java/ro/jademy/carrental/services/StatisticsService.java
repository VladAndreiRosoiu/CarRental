package ro.jademy.carrental.services;

import ro.jademy.carrental.models.RentedCar;
import ro.jademy.carrental.models.users.Client;

import java.util.List;

public interface StatisticsService {

    int currentlyGeneratedIncome(List<RentedCar> currentlyRented);

    void highestIncomeGenerated(Client client);

    void mostRentedCar(List<Client> clients);

    void userWithMostRentals(List<Client> clients);
}
