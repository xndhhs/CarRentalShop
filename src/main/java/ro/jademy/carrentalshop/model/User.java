package ro.jademy.carrentalshop.model;

import ro.jademy.carrentalshop.cars.Car;

import java.util.Date;

public class User implements Payable{
    //user can login
    //access a menu for actions (see cars, rent a car, return a car, calculate rates)
    private String userName;
    private String userPass;
    private int age;
    private Date pickupDate;
    private Date returnDate;
    private double amountToPay;
    private Car carRented;

    public String getUserName() {
        return userName;
    }

    public void setUserName( String userName ) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass( String userPass ) {
        this.userPass = userPass;
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate( Date pickupDate ) {
        this.pickupDate = pickupDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate( Date returnDate ) {
        this.returnDate = returnDate;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay( double amountToPay ) {
        this.amountToPay = amountToPay;
    }

    public Car getCarRented() {
        return carRented;
    }

    public void setCarRented( Car carRented ) {
        this.carRented = carRented;
    }

    @Override
    public void calculateNoOfDays() {
        int numberOfDays = (int) (getReturnDate().getTime() - getPickupDate().getTime()) / (1000 * 60 * 60 *24);
        System.out.println(numberOfDays);
        //return numberOfDays;
    }

    @Override
    public void calculateFee() {

    }

    @Override
    public void applyDiscount() {

    }
}
