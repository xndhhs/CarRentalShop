package ro.jademy.carrentalshop.model;

public class SmallCar extends Car{
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory( String category ) {
        this.category = category;
    }

    public SmallCar( String make, String model, String gearbox, String fuelType, int noOfSeats, double pricePerDay, String category) {
        super(make, model, gearbox, fuelType, noOfSeats, pricePerDay);
        this.category = category;
    }
}
