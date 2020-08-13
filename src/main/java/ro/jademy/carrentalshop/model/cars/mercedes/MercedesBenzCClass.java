package ro.jademy.carrentalshop.model.cars.mercedes;

public class MercedesBenzCClass extends MercedesBenz {
    public MercedesBenzCClass() {
    }

    public MercedesBenzCClass(String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, long pricePerDay, String carType) {
        super("Mercedes-Benz", model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
