package ro.jademy.carrentalshop.model.cars.renault;

import ro.jademy.carrentalshop.model.cars.Car;

public class Renault extends Car {


    public Renault() {

    }

    public Renault(String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, double pricePerDay, String carType) {
        super("Renault", model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
