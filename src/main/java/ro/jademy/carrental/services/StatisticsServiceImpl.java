package ro.jademy.carrental.services;

import ro.jademy.carrental.models.RentedCar;
import ro.jademy.carrental.models.users.Client;

import java.util.List;

public class StatisticsServiceImpl implements StatisticsService {
    @Override
    public int currentlyGeneratedIncome(List<RentedCar> currentlyRented) {
        int currentIncome=0;
        for (RentedCar rentedCar:currentlyRented){
            currentIncome+=rentedCar.getRentPriceAfterDiscount();
        }
        return currentIncome;
    }

    @Override
    public void highestIncomeGenerated(Client client) {

    }

    @Override
    public void mostRentedCar(List<Client> clients) {

    }

    @Override
    public void userWithMostRentals(List<Client> clients) {

    }
}
