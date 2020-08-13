package ro.jademy.carrentalshop.model.cars.renault;

public class RenaultCaptur extends Renault {
    public RenaultCaptur() {
    }

    public RenaultCaptur(String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, long pricePerDay, String carType) {
        super(model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
