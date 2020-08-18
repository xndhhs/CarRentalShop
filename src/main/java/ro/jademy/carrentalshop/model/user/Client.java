package ro.jademy.carrentalshop.model.user;

import ro.jademy.carrentalshop.model.RentalShop;
import ro.jademy.carrentalshop.model.cars.Car;
import ro.jademy.carrentalshop.model.cars.ExtraOptions;
import ro.jademy.carrentalshop.util.InputUtils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client extends User implements Payable {

    private LocalDate licenseGainedDate;
    private LocalDate birthDate;
    private List<RentedCar> carRentedHistory = new ArrayList<>();

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

    public void setLicenseGainedDate( LocalDate licenseGainedDate ) {
        this.licenseGainedDate = licenseGainedDate;
    }

    public void setBirthDate( LocalDate birthDate ) {
        this.birthDate = birthDate;
    }

    public void setCarRentedHistory( List<RentedCar> carRentedHistory ) {
        this.carRentedHistory = carRentedHistory;
    }
// choose a car from the list
    // add extras to chosen car
    // rent a car [date from] - [date to]
    // calculate price
    // return a car
    // show car history

    public List<ExtraOptions> rentExtraOptions( List<ExtraOptions> extraOptions, List<Integer> extraOptionsIndices) {
        List<ExtraOptions> rentedExtraOptions = new ArrayList<>();
        for (int i = 0; i < extraOptionsIndices.size(); i++) {
            rentedExtraOptions.add(extraOptions.get(i));
        }

        return rentedExtraOptions;
    }

    @Override
    public int calculateNoOfDays(String startDate, String endDate) {
        LocalDate formattedStartDate = InputUtils.formatDate(startDate);
        LocalDate formattedEndDate = InputUtils.formatDate(endDate);
        Period period = Period.between(formattedStartDate,formattedEndDate);
        int noOfDays = (period.getDays());
        return noOfDays;

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
