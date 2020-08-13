package ro.jademy.carrentalshop.model.cars.mercedes;

import ro.jademy.carrentalshop.model.cars.Car;

public class MercedesBenz extends Car {

    public MercedesBenz() {
    }

    public MercedesBenz(String make, String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, double pricePerDay, String carType) {
        super(make, model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
