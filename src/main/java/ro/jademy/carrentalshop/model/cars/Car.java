package ro.jademy.carrentalshop.model.cars;

import java.util.Objects;

public abstract class Car implements Comparable <Car> {
    protected String make;
    protected String model;
    protected String gearbox;
    protected String fuelType;
    protected int noOfDoors;
    protected int noOfSeats;
    protected double pricePerDay;
    protected String carType;
    private boolean rented = false;

    public Car() {
    }

    public Car( String make, String model, String gearbox, String fuelType, int noOfDoors, int noOfSeats, double pricePerDay, String carType) {
        this.make = make;
        this.model = model;
        this.gearbox = gearbox;
        this.fuelType = fuelType;
        this.noOfDoors = noOfDoors;
        this.noOfSeats = noOfSeats;
        this.pricePerDay = pricePerDay;
        this.carType = carType;

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

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return noOfDoors == car.noOfDoors &&
                noOfSeats == car.noOfSeats &&
                Double.compare(car.pricePerDay, pricePerDay) == 0 &&
                Objects.equals(make, car.make) &&
                Objects.equals(model, car.model) &&
                Objects.equals(gearbox, car.gearbox) &&
                Objects.equals(fuelType, car.fuelType) &&
                Objects.equals(carType, car.carType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, gearbox, fuelType, noOfDoors, noOfSeats, pricePerDay, carType);
    }
    @Override
    public int compareTo(Car o) {
        return this.getMake().compareTo(o.getMake());
    }
}
