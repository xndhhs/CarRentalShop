package ro.jademy.carrentalshop.model.cars.toyota;

public class ToyotaAygo extends Toyota {
    public ToyotaAygo() {

    }

    public ToyotaAygo(String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, long pricePerDay, String carType) {
        super(model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
