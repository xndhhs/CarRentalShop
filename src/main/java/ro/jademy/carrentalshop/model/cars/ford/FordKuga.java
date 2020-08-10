package ro.jademy.carrentalshop.model.cars.ford;

public class FordKuga extends Ford{
    public FordKuga() {
    }

    public FordKuga(String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, double pricePerDay, String carType) {
        super(model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
}
