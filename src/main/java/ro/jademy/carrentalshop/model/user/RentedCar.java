package ro.jademy.carrentalshop.model.user;

import ro.jademy.carrentalshop.model.cars.Car;
import ro.jademy.carrentalshop.model.cars.ExtraOptions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RentedCar {
    private Car rentedCar;
    private LocalDate pickupDate;
    private LocalDate returnDate;
    private boolean isRented;
    private double amountToPayRON;
    private double amountToPayEUR = amountToPayRON / 4.82;
    private List<ExtraOptions> extraOptions = new ArrayList<>();

    public RentedCar() {

    }

    public RentedCar(Car rentedCar, LocalDate pickupDate, LocalDate returnDate, boolean isRented, double amountToPayRON) {
        this.rentedCar = rentedCar;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.isRented = isRented;
        this.amountToPayRON = amountToPayRON;

    }

    public List<ExtraOptions> getExtraOptions() {
        return extraOptions;
    }

    public void setExtraOptions(List<ExtraOptions> extraOptions) {
        this.extraOptions = extraOptions;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public double getAmountToPayRON() {
        return amountToPayRON;
    }

    public void setAmountToPayRON(double amountToPayRON) {
        this.amountToPayRON = amountToPayRON;
    }

    public double getAmountToPayEUR() {
        return amountToPayEUR;
    }

    public void setAmountToPayEUR(double amountToPayEUR) {
        this.amountToPayEUR = amountToPayEUR;
    }

    public Car getRentedCar() {
        return rentedCar;
    }

    public void setRentedCar(Car rentedCar) {
        this.rentedCar = rentedCar;
    }

    public LocalDate getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDate pickupDate) {
        this.pickupDate = pickupDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

}

