package ro.jademy.carrentalshop.model.cars.opel;

public class OpelGrandland extends Opel {
    public OpelGrandland() {
    }

    public OpelGrandland(String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, long pricePerDay, String carType) {
        super(model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
