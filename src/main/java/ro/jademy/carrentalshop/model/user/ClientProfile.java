package ro.jademy.carrentalshop.model.user;

import java.time.LocalDate;
import java.util.List;

public class ClientProfile extends User implements Payable {
    public ClientProfile( String userName, String userPass, int age, List<RentedCar> carRentedHistory, LocalDate licenseGainedDate ) {
        super(userName, userPass, age, carRentedHistory, licenseGainedDate);
    }
    @Override
    public void calculateNoOfDays() {
        // int numberOfDays = (int) (getReturnDate().getTime() - getPickupDate().getTime()) / (1000 * 60 * 60 *24);
        // System.out.println(numberOfDays);
        //return numberOfDays;
    }

    @Override
    public void calculateFee() {

    }

    @Override
    public void applyDiscount() {

    }
}
