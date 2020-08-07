package ro.jademy.carrentalshop.model.cars;

public abstract class Car {
    private String make;
    private String model;
    private String gearbox;
    private String fuelType;
    private int noOfDoors;
    private int noOfSeats;
    private double pricePerDay;
    private String carType;
    private boolean rented = false;

    public Car() {
    }

    public Car( String make, String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, double pricePerDay, String carType, boolean rented ) {
        this.make = make;
        this.model = model;
        this.gearbox = gearbox;
        this.fuelType = fuelType;
        this.noOfDoors = noOfDoors;
        this.noOfSeats = noOfSeats;
        this.pricePerDay = pricePerDay;
        this.carType = carType;
        this.rented = rented;
    }

    public String getMake() {
        return make;
    }

    public void setMake( String make ) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel( String model ) {
        this.model = model;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox( String gearbox ) {
        this.gearbox = gearbox;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType( String fuelType ) {
        this.fuelType = fuelType;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors( int noOfDoors ) {
        this.noOfDoors = noOfDoors;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats( int noOfSeats ) {
        this.noOfSeats = noOfSeats;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay( double pricePerDay ) {
        this.pricePerDay = pricePerDay;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType( String carType ) {
        this.carType = carType;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented( boolean rented ) {
        this.rented = rented;
    }
}
