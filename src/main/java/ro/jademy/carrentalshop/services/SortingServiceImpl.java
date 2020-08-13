package ro.jademy.carrentalshop.services;

import ro.jademy.carrentalshop.model.cars.Car;

import java.util.ArrayList;
import java.util.List;

public class SortingServiceImpl implements SortingService {

    @Override
    public List<Car> sortByMake(List<Car> carList) {
        List<Car> sortedCarList = new ArrayList<>(carList);
        sortedCarList.sort((o1, o2) -> o1.getMake().compareTo(o2.getMake()));

        return sortedCarList;
    }

    @Override
    public List<Car> sortByModel(List<Car> carList) {
        List<Car> sortedCarList = new ArrayList<>(carList);
        sortedCarList.sort((o1, o2) -> o1.getModel().compareTo(o2.getModel()));

        return sortedCarList;
    }

    @Override
    public List<Car> sortByFuelType(List<Car> carList) {
        List<Car> sortedCarList = new ArrayList<>(carList);
        sortedCarList.sort((o1, o2) -> o1.getFuelType().compareTo(o2.getFuelType()));

        return sortedCarList;
    }

    @Override
    public List<Car> sortByGearbox(List<Car> carList) {
        List<Car> sortedCarList = new ArrayList<>(carList);
        sortedCarList.sort((o1, o2) -> o1.getGearbox().compareTo(o2.getGearbox()));

        return sortedCarList;
    }

    @Override
    public List<Car> sortByCategory(List<Car> carList) {
        List<Car> sortedCarList = new ArrayList<>(carList);
        sortedCarList.sort((o1, o2) -> o1.getCarType().compareTo(o2.getCarType()));

        return sortedCarList;
    }

    @Override
    public List<Car> sortByPrice(List<Car> carList) {
        List<Car> sortedCarList = new ArrayList<>(carList);
        sortedCarList.sort((o1, o2) -> o1.getPricePerDay().compareTo(o2.getPricePerDay()));

        return sortedCarList;
    }
}
