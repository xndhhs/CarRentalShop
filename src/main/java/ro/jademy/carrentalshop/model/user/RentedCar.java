package ro.jademy.carrentalshop.model.user;

import ro.jademy.carrentalshop.model.cars.Car;
import ro.jademy.carrentalshop.model.cars.ExtraOptions;

import java.time.LocalDate;
import java.util.ArrayList;

public class RentedCar {
    private Car rentedCar;
    private LocalDate pickupDate;
    private LocalDate returnDate;
    private boolean isRented;
    private double amountToPayRON;
    private double amountToPayEUR;
    private ArrayList<ExtraOptions> extraOptions = new ArrayList<>();

    public ArrayList<ExtraOptions> getExtraOptions() {
        return extraOptions;
    }

    public void setExtraOptions( ArrayList<ExtraOptions> extraOptions ) {
        this.extraOptions = extraOptions;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented( boolean rented ) {
        isRented = rented;
    }

    public double getAmountToPayRON() {
        return amountToPayRON;
    }

    public void setAmountToPayRON( double amountToPayRON ) {
        this.amountToPayRON = amountToPayRON;
    }

    public double getAmountToPayEUR() {
        return amountToPayEUR;
    }

    public void setAmountToPayEUR( double amountToPayEUR ) {
        this.amountToPayEUR = amountToPayEUR;
    }

    public Car getRentedCar() {
        return rentedCar;
    }

    public void setRentedCar( Car rentedCar ) {
        this.rentedCar = rentedCar;
    }

    public LocalDate getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate( LocalDate pickupDate ) {
        this.pickupDate = pickupDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate( LocalDate returnDate ) {
        this.returnDate = returnDate;
    }
    public RentedCar () {

    }

    public RentedCar( Car rentedCar, LocalDate pickupDate, LocalDate returnDate, boolean isRented, double amountToPayRON, double amountToPayEUR, ArrayList<ExtraOptions> extraOptions) {
        this.rentedCar = rentedCar;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.isRented = isRented;
        this.amountToPayRON = amountToPayRON;
        this.amountToPayEUR = amountToPayEUR;
        this.extraOptions = extraOptions;
    }

}
