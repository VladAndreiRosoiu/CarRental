package ro.jademy.carrental.data;

import ro.jademy.carrental.models.RentedCar;
import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.models.cars.dacia.Logan;
import ro.jademy.carrental.models.cars.mercedes.GLE;
import ro.jademy.carrental.models.users.Client;
import ro.jademy.carrental.models.users.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RentalList {
    Car car1 = new Logan(1, 10, 4, "Gasoline");
    Car car2 = new GLE(4, 80, 5, "Gasoline");
    Car car3 = new GLE(4, 80, 5, "Gasoline");
    User user1 = new Client("Test1", "Test1", "test", "test", LocalDate.of(2010, 2, 28));
    User user2 = new Client("Test2", "Test2", "test", "test", LocalDate.of(2010, 2, 28));
    User user3 = new Client("Test3", "Test3", "test", "test", LocalDate.of(2010, 2, 28));

    RentedCar rentedCar1=new RentedCar(car1,(Client) user1, 10);
    RentedCar rentedCar2=new RentedCar(car2,(Client) user2, 80);
    RentedCar rentedCar3=new RentedCar(car3,(Client) user3, 80);

    public List<RentedCar> getRentalList(){
        List<RentedCar> rentedCars=new ArrayList<>();
        rentedCars.add(rentedCar1);
        rentedCars.add(rentedCar2);
        rentedCars.add(rentedCar3);
        return rentedCars;
    }
}
