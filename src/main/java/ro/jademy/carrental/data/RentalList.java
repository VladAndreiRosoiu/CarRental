package ro.jademy.carrental.data;

import ro.jademy.carrental.models.RentedCar;
import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.models.cars.RentCategory;
import ro.jademy.carrental.models.cars.dacia.Logan;
import ro.jademy.carrental.models.cars.mercedes.GLE;
import ro.jademy.carrental.models.users.Client;
import ro.jademy.carrental.models.users.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RentalList {

    public List<RentedCar> getRentalList() {
        List<RentedCar> rentedCars = new ArrayList<>();
        Car car1 = new Logan(110, 4, "Gasoline", RentCategory.ONE);
        Car car2 = new GLE(80, 5, "Gasoline", RentCategory.FOUR);
        Car car3 = new GLE(80, 5, "Gasoline", RentCategory.FOUR);
        LocalDate pickUpDate = LocalDate.now();
        LocalDate returnDate = pickUpDate.plusDays(1);
        User user1 = new Client("Test1", "Test1", "test", "test", LocalDate.of(2010, 2, 28));
        User user2 = new Client("Test2", "Test2", "test", "test", LocalDate.of(2010, 2, 28));
        User user3 = new Client("Test3", "Test3", "test", "test", LocalDate.of(2010, 2, 28));
        RentedCar rentedCar1 = new RentedCar(car1, (Client) user1, 10, pickUpDate, returnDate);
        RentedCar rentedCar2 = new RentedCar(car2, (Client) user2, 80, pickUpDate, returnDate);
        RentedCar rentedCar3 = new RentedCar(car3, (Client) user3, 80, pickUpDate, returnDate);
        rentedCars.add(rentedCar1);
        rentedCars.add(rentedCar2);
        rentedCars.add(rentedCar3);
        return rentedCars;
    }
}
