package ro.jademy.carrental.services;

import ro.jademy.carrental.models.RentedCar;
import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.models.cars.RentCategory;
import ro.jademy.carrental.models.users.Client;

import java.time.LocalDate;
import java.util.List;

public class RentServiceImpl implements RentService {

    @Override
    public boolean validateDriverLicence(Client client, Car car) {

        LocalDate currentDate = LocalDate.now();
        LocalDate dateToRentCategoryOneCar = currentDate.minusYears(1);
        LocalDate dateToRentCategoryTwoCar = currentDate.minusYears(2);
        LocalDate dateToRentCategoryThreeCar = currentDate.minusYears(3);
        LocalDate dateToRentCategoryFourCar = currentDate.minusYears(3);

        if (car.getRentCategory()== RentCategory.ONE) {
            return client.getLicenceIssueDate().isBefore(dateToRentCategoryOneCar);
        } else if (car.getRentCategory()== RentCategory.TWO) {
            return client.getLicenceIssueDate().isBefore(dateToRentCategoryTwoCar);
        } else if (car.getRentCategory()== RentCategory.THREE) {
            return client.getLicenceIssueDate().isBefore(dateToRentCategoryThreeCar);
        } else if (car.getRentCategory()== RentCategory.FOUR) {
            return client.getLicenceIssueDate().isBefore(dateToRentCategoryFourCar);
        }
        return false;

    }

    @Override
    public boolean validateDepositForRent(Client client, Car car) {
        if (client.getDeposit() >= 100 && car.getRentCategory()== RentCategory.ONE) {
            return true;
        }
        if (client.getDeposit() >= 200 && car.getRentCategory()== RentCategory.TWO) {
            return true;
        }
        if (client.getDeposit() >= 300 && car.getRentCategory()== RentCategory.THREE) {
            return true;
        }
        return client.getDeposit() >= 400 && car.getRentCategory()== RentCategory.FOUR;
    }

    @Override
    public void rentCar(List<Car> carList, Client client, Car car) {
        client.setCurrentlyRentedCar(car);
        carList.remove(car);
    }

    @Override
    public int calculateFinalRentPrice(Car car, int nrOfDays) {

        boolean daysToRent;
        daysToRent = nrOfDays > 10;

        if (car.getRentCategory()== RentCategory.ONE && daysToRent) {
            return (car.getRentPricePerDay() - 2) * nrOfDays;
        } else if (car.getRentCategory()== RentCategory.TWO && daysToRent) {
            return (car.getRentPricePerDay() - 5) * nrOfDays;
        } else if (car.getRentCategory()== RentCategory.THREE && daysToRent) {
            return (car.getRentPricePerDay() - 15) * nrOfDays;
        } else if ((car.getRentCategory()== RentCategory.FOUR && daysToRent)) {
            return (car.getRentPricePerDay() - 15) * nrOfDays;
        } else {
            return car.getRentPricePerDay() * nrOfDays;
        }
    }

    @Override
    public RentedCar rentedCar(Car car, Client client, int rentPrice, LocalDate pickUpDate, LocalDate returnDate) {
        RentedCar rentedCar = new RentedCar();
        rentedCar.setRentedCar(car);
        rentedCar.setClient(client);
        rentedCar.setRentDate(pickUpDate);
        rentedCar.setReturnDate(returnDate);
        rentedCar.setFinalTotalRentPrice(rentPrice);
        return rentedCar;
    }

    @Override
    public boolean validatePayedAmount(int payed, List<RentedCar> currentlyRentedCars, Client client) {
        for (RentedCar rentedCar : currentlyRentedCars) {
            if (rentedCar.getClient().getUserName().equals(client.getUserName()) &&
                    rentedCar.getRentedCar().equals(client.getCurrentlyRentedCar()) && payed == rentedCar.getFinalTotalRentPrice()) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void returnRentedCar(List<Car> carList, List<RentedCar> currentlyRentedCars, Client client) {
        RentedCar rented = new RentedCar();
        for (RentedCar rentedCar : currentlyRentedCars) {
            if (rentedCar.getClient().getUserName().equals(client.getUserName()) &&
                    rentedCar.getRentedCar().equals(client.getCurrentlyRentedCar())) {
                rented = rentedCar;
            }
        }

        client.getRentalHistory().add(rented);
        carList.add(rented.getRentedCar());
        currentlyRentedCars.remove(rented);
        client.setCurrentlyRentedCar(null);
        client.setDeposit(0);
    }
}
