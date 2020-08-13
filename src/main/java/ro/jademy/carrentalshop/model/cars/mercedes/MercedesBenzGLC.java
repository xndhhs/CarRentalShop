package ro.jademy.carrentalshop.model.cars.mercedes;

public class MercedesBenzGLC extends MercedesBenz {
    public MercedesBenzGLC() {
    }

    public MercedesBenzGLC(String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, long pricePerDay, String carType) {
        super("Mercedes-Benz", model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
