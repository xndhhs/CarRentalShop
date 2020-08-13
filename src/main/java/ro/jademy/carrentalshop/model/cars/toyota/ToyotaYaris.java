package ro.jademy.carrentalshop.model.cars.toyota;

public class ToyotaYaris extends Toyota {
    public ToyotaYaris() {
    }

    public ToyotaYaris(String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, double pricePerDay, String carType) {
        super(model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
