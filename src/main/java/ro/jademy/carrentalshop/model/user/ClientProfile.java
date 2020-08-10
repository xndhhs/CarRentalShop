package ro.jademy.carrentalshop.model.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClientProfile extends User implements Payable {

    private LocalDate licenseGainedDate;
    private int age;
    private List<RentedCar> carRentedHistory = new ArrayList<>();

    public ClientProfile( String userName, String userPass, String firstName, String lastName, LocalDate licenseGainedDate, int age) {
        super(userName, userPass, firstName, lastName);
        this.licenseGainedDate = licenseGainedDate;
        this.age = age;

    }


        //choose a car from the list
        //add extras to chosen car
        //rent a car [date from] - [date to]
       //calculate price
        //return a car
        //show car history
        //get current rented car for a user
        public RentedCar getCurrentRentedCar () {
            for (RentedCar item: carRentedHistory) {
                if(item.isRented()){
                    return item;
                }
            }
            return null;
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
