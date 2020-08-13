package ro.jademy.carrentalshop.model.cars.opel;

import ro.jademy.carrentalshop.model.cars.Car;

public class Opel extends Car {


    public Opel() {

    }

    public Opel(String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, double pricePerDay, String carType) {
        super("Opel", model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
