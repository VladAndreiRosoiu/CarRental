package ro.jademy.carrental.data;

import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.cars.dacia.Logan;
import ro.jademy.carrental.cars.dacia.MCV;
import ro.jademy.carrental.cars.dacia.Sandero;
import ro.jademy.carrental.cars.mercedes.AClass;
import ro.jademy.carrental.cars.mercedes.CClass;
import ro.jademy.carrental.cars.mercedes.GLE;
import ro.jademy.carrental.cars.volkswagen.Golf;
import ro.jademy.carrental.cars.volkswagen.Touran;
import ro.jademy.carrental.cars.volkswagen.Tuareg;

import java.util.ArrayList;
import java.util.List;

public class CarList {

    Car car1 = new Logan(1, 10, 4,"Gasoline",false);
    Car car2 = new Logan(1, 10,4,"Diesel",false);
    Car car3 = new Sandero(1, 7,4,"Gasoline",false);
    Car car4 = new Sandero(1, 7,4,"Gasoline",false);
    Car car5 = new MCV(1, 15,5,"Diesel",false);
    Car car6 = new MCV(1, 15,5,"Diesel",false);
    Car car7 = new Golf(2, 20,4,"Diesel",false);
    Car car8 = new Golf(2, 20,4,"Gasoline",false);
    Car car9 = new Touran(2, 25,5,"Diesel",false);
    Car car10 = new Touran(2, 25,7,"Diesel",false);
    Car car11 = new Tuareg(4, 60,7,"Diesel",false);
    Car car12 = new Tuareg(4, 60,5,"Diesel",false);
    Car car13 = new AClass(2, 30,4,"Gasoline",false);
    Car car14 = new AClass(2, 30,4,"Gasoline",false);
    Car car15 = new CClass(3, 40,5,"Diesel",false);
    Car car16 = new CClass(3, 40,5,"Diesel",false);
    Car car17 = new GLE(4, 80,5,"Diesel",false);
    Car car18 = new GLE(4, 80,5,"Gasoline",false);

    public List<Car> getCarList(){
        List<Car> carList=new ArrayList<>();
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
