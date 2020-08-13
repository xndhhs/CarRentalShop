package ro.jademy.carrentalshop.model.user;

import ro.jademy.carrentalshop.model.RentalShop;
import ro.jademy.carrentalshop.model.cars.Car;
import ro.jademy.carrentalshop.model.cars.ExtraOptions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client extends User implements Payable {

    private final LocalDate licenseGainedDate;
    private final LocalDate birthDate;
    private final List<RentedCar> carRentedHistory = new ArrayList<>();

    public Client(String userName, String userPass, String firstName, String lastName, LocalDate licenseGainedDate, LocalDate birthDate) {
        super(userName, userPass, firstName, lastName);
        this.licenseGainedDate = licenseGainedDate;
        this.birthDate = birthDate;
    }

    public LocalDate getLicenseGainedDate() {
        return licenseGainedDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<RentedCar> getCarRentedHistory() {
        return carRentedHistory;
    }

    // choose a car from the list
    // add extras to chosen car
    // rent a car [date from] - [date to]
    // calculate price
    // return a car
    // show car history

    public List<ExtraOptions> rentExtraOptions(List<ExtraOptions> extraOptions, int... extraOptionsIndices) {
        List<ExtraOptions> rentedExtraOptions = new ArrayList<>();
        for (int i = 0; i < extraOptionsIndices.length; i++) {
            rentedExtraOptions.add(extraOptions.get(i));
        }

        return rentedExtraOptions;
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
