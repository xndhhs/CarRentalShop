package ro.jademy.carrentalshop.model.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User{
    //user can login
    //access a menu for actions (see cars, rent a car, return a car, calculate rates)
    private String userName;
    private String userPass;
    private LocalDate licenseGainedDate;
    private int age;
    private List<RentedCar> carRentedHistory = new ArrayList<>();

    public User( String userName, String userPass, int age, List<RentedCar> carRentedHistory,LocalDate licenseGainedDate ) {
        this.userName = userName;
        this.userPass = userPass;
        this.age = age;
        this.carRentedHistory = carRentedHistory;
        this.licenseGainedDate = licenseGainedDate;
    }

    public LocalDate getLicenseGainedDate() {
        return licenseGainedDate;
    }

    public void setLicenseGainedDate( LocalDate licenseGainedDate ) {
        this.licenseGainedDate = licenseGainedDate;
    }

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

    public List<RentedCar> getCarRentedHistory() {
        return carRentedHistory;
    }

    public void setCarRentedHistory( List<RentedCar> carRentedHistory ) {
        this.carRentedHistory = carRentedHistory;
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }



}
