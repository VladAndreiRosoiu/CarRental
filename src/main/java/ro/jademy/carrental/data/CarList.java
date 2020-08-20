package ro.jademy.carrental.data;

import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.models.cars.RentCategory;
import ro.jademy.carrental.models.cars.dacia.Logan;
import ro.jademy.carrental.models.cars.dacia.MCV;
import ro.jademy.carrental.models.cars.dacia.Sandero;
import ro.jademy.carrental.models.cars.mercedes.AClass;
import ro.jademy.carrental.models.cars.mercedes.CClass;
import ro.jademy.carrental.models.cars.mercedes.GLE;
import ro.jademy.carrental.models.cars.volkswagen.Golf;
import ro.jademy.carrental.models.cars.volkswagen.Touran;
import ro.jademy.carrental.models.cars.volkswagen.Tuareg;

import java.util.ArrayList;
import java.util.List;

public class CarList {


    public static List<Car> getCarList() {
        Car car1 = new Logan( 10, 4, "Gasoline", RentCategory.ONE);
        Car car2 = new Logan( 10, 4, "Diesel", RentCategory.ONE);
        Car car3 = new Sandero( 7, 4, "Gasoline", RentCategory.ONE);
        Car car4 = new Sandero( 7, 4, "Gasoline", RentCategory.ONE);
        Car car5 = new MCV( 15, 5, "Diesel", RentCategory.ONE);
        Car car6 = new MCV( 15, 5, "Diesel", RentCategory.ONE);
        Car car7 = new Golf( 20, 4, "Diesel", RentCategory.TWO);
        Car car8 = new Golf( 20, 4, "Gasoline", RentCategory.TWO);
        Car car9 = new Touran( 25, 5, "Diesel", RentCategory.TWO);
        Car car10 = new Touran( 25, 7, "Diesel", RentCategory.TWO);
        Car car11 = new Tuareg( 60, 7, "Diesel", RentCategory.TWO);
        Car car12 = new Tuareg( 60, 5, "Diesel", RentCategory.TWO);
        Car car13 = new AClass( 30, 4, "Gasoline", RentCategory.TWO);
        Car car14 = new AClass( 30, 4, "Gasoline", RentCategory.TWO);
        Car car15 = new CClass( 40, 5, "Diesel", RentCategory.THREE);
        Car car16 = new CClass( 40, 5, "Diesel", RentCategory.THREE);
        Car car17 = new GLE( 80, 5, "Diesel", RentCategory.FOUR);
        Car car18 = new GLE( 80, 5, "Gasoline", RentCategory.FOUR);
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);
        carList.add(car14);
        carList.add(car15);
        carList.add(car16);
        carList.add(car17);
        carList.add(car18);
        return carList;
    }
}
