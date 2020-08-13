package ro.jademy.carrentalshop.model.cars.renault;

public class RenaultZoe extends Renault {
    public RenaultZoe() {
    }

    public RenaultZoe(String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, long pricePerDay, String carType) {
        super(model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
