package ro.jademy.carrentalshop.model.cars.toyota;

import ro.jademy.carrentalshop.model.cars.Car;

public class Toyota extends Car {


    public Toyota() {
    }

    public Toyota(String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, double pricePerDay, String carType) {
        super("Toyota", model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
