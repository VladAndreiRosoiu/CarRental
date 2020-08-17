package ro.jademy.carrental.services;

import ro.jademy.carrental.models.cars.Car;

import java.util.List;

public interface SearchService {

    List<Car> searchCarByMake(List<Car> carList, String keyword);

    List<Car> searchCarByModel(List<Car> carList, String keyword);

    List<Car> searchCarByPriceRange(List<Car> carList, int lowestPrice, int highestPrice);

    Car searchCarByUUID(List<Car> carList, String keyword);
}
