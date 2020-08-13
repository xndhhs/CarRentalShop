package ro.jademy.carrentalshop.model.cars.renault;

public class RenaultMegane extends Renault {
    public RenaultMegane() {
    }

    public RenaultMegane(String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, long pricePerDay, String carType) {
        super(model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
