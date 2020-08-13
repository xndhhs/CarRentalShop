package ro.jademy.carrentalshop.services;

import ro.jademy.carrentalshop.model.cars.Car;

import java.util.List;

public interface SortingService {

    //implement methods to sort by different criteria
    List<Car> sortByMake(List<Car> carList);

    List<Car> sortByModel(List<Car> carList);

    List<Car> sortByFuelType(List<Car> carList);

    List<Car> sortByGearbox(List<Car> carList);

    List<Car> sortByCategory(List<Car> carList);

    List<Car> sortByPrice(List<Car> carList);

    //remove unavailable cars

}
