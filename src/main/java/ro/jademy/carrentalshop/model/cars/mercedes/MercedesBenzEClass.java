package ro.jademy.carrentalshop.model.cars.mercedes;

public class MercedesBenzEClass extends MercedesBenz {
    public MercedesBenzEClass() {
    }

    public MercedesBenzEClass(String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, double pricePerDay, String carType) {
        super("Mercedes-Benz", model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
