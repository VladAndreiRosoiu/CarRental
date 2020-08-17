package ro.jademy.carrental.services;

import ro.jademy.carrental.models.cars.Car;

import java.util.ArrayList;
import java.util.List;

public class SearchServiceImpl implements SearchService {
    @Override
    public List<Car> searchCarByMake(List<Car> carList, String keyword) {
        List<Car> filteredList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getMake().toLowerCase().equals(keyword)) {
                filteredList.add(car);
            }
        }
        return filteredList;
    }

    @Override
    public List<Car> searchCarByModel(List<Car> carList, String keyword) {
        List<Car> filteredList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getModel().toLowerCase().equals(keyword)) {
                filteredList.add(car);
            }
        }
        return filteredList;
    }

    @Override
    public List<Car> searchCarByPriceRange(List<Car> carList, int lowestPrice, int highestPrice) {
        List<Car> filteredList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getRentPricePerDay() >= lowestPrice && car.getRentPricePerDay() <= lowestPrice) {
                filteredList.add(car);
            }
        }
        return filteredList;
    }

    @Override
    public Car searchCarByUUID(List<Car> carList, String keyword) {
        for (Car car : carList) {
            if (keyword.equals(car.getUUID())) {
                return car;
            }
        }
        return null;
    }
}
