package ro.jademy.carrental.services;

import ro.jademy.carrental.models.RentedCar;
import ro.jademy.carrental.models.users.Client;
import ro.jademy.carrental.models.users.User;

import java.util.ArrayList;
import java.util.List;

public class StatisticsServiceImpl implements StatisticsService {
    @Override
    public int calculateCurrentIncome(List<RentedCar> currentlyRented) {
        int currentIncome = 0;
        for (RentedCar rentedCar : currentlyRented) {
            currentIncome += rentedCar.getFinalTotalRentPrice();
        }
        return currentIncome;
    }

    @Override
    public int calculateHighestIncomeGenerated(List<User> users) {
        List<Client> clients = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Client) {
                clients.add((Client) user);
            }
        }
        int amount = 0;
        int price = 0;
        for (Client client : clients) {
            for (RentedCar rentedCar : client.getRentalHistory()) {
                amount += rentedCar.getFinalTotalRentPrice();
            }
            if (price <= amount) {
                price = amount;
            }
        }
        return price;
    }

    @Override
    public void doMostRentedCar(List<Client> clients) {

    }

    @Override
    public void doClientWithMostRentals(List<Client> clients) {

    }
}
