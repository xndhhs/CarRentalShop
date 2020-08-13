package ro.jademy.carrentalshop.model.cars.dacia;

import ro.jademy.carrentalshop.model.cars.Car;

public class Dacia extends Car {


    public Dacia() {

    }

    public Dacia(String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, long pricePerDay, String carType) {
        super("Dacia", model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
