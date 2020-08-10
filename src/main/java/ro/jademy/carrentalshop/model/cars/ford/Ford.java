package ro.jademy.carrentalshop.model.cars.ford;

import ro.jademy.carrentalshop.model.cars.Car;

public class Ford extends Car {


    public Ford() {

    }

    public Ford(String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, double pricePerDay, String carType) {
        super("Ford", model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
