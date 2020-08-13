package ro.jademy.carrentalshop.model.user;

import ro.jademy.carrentalshop.model.RentalShop;
import ro.jademy.carrentalshop.model.cars.Car;
import ro.jademy.carrentalshop.model.cars.ExtraOptions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientProfile extends User implements Payable {

    private final LocalDate licenseGainedDate;
    private final int age;
    private final List<RentedCar> carRentedHistory = new ArrayList<>();

    public ClientProfile(String userName, String userPass, String firstName, String lastName, LocalDate licenseGainedDate, int age) {
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

    public static List<ExtraOptions> userRentsExtraOption(RentalShop rentalShop) {
        Scanner scanner = new Scanner(System.in);
        List<ExtraOptions> userRentsExtraOption = new ArrayList<>();
        RentalShop.showAllExtras(rentalShop);
        System.out.println("Choose the options you want to add separated by commas: ");
        String options = scanner.next();
        int i = 0;
        do {
            int position = Character.getNumericValue(options.charAt(i)) - 1;
            userRentsExtraOption.add(rentalShop.getExtras().get(position));
            i += 2;

        } while (i < options.length());

        for (ExtraOptions extraOption : userRentsExtraOption) {
            System.out.println(extraOption.getName());
        }
        return userRentsExtraOption;
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

    public Car userRentsCar(RentalShop rentalShop) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the car you want to rent: ");
        int position = scanner.nextInt();
        Car rentedCar = rentalShop.getCars().get(position - 1);
        return rentedCar;
    }
}
