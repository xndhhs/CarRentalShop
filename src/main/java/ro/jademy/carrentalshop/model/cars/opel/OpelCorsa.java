package ro.jademy.carrentalshop.model.cars.opel;

public class OpelCorsa extends Opel {
    public OpelCorsa() {
    }

    public OpelCorsa(String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, long pricePerDay, String carType) {
        super(model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
