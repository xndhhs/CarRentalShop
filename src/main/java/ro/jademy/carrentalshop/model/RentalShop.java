package ro.jademy.carrentalshop.model;

import org.apache.commons.lang3.StringUtils;
import ro.jademy.carrentalshop.data.CarBuilder;
import ro.jademy.carrentalshop.data.ExtrasBuilder;
import ro.jademy.carrentalshop.model.cars.Car;
import ro.jademy.carrentalshop.model.cars.ExtraOptions;
import ro.jademy.carrentalshop.model.user.ShopSalesman;
import ro.jademy.carrentalshop.model.user.User;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RentalShop {
    ArrayList<ExtraOptions> extras;
    ArrayList<Car> cars;
    ArrayList<User> users;

    public RentalShop( ArrayList<ExtraOptions> extras, ArrayList<Car> cars, ArrayList<User> users ) {
        this.extras = extras;
        this.cars = cars;
        this.users = users;
    }

    public ArrayList<ExtraOptions> getExtras() {
        return extras;
    }

    public void setExtras( ArrayList<ExtraOptions> extras ) {
        this.extras = ExtrasBuilder.getAllExtras();
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars( ArrayList<Car> cars ) {
        this.cars = cars;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers( ArrayList<User> users ) {
        this.users = users;
    }

//    sort cars by:make, fuel,gearbox,type(size), price
//print raw car data
public static void showAllCars( RentalShop carRentals ) {
    System.out.println(StringUtils.center("  Make", 16, " ") + StringUtils.center("  Model", 16, " ") + StringUtils.center("Fuel type", 16, ' ')
            + StringUtils.center("Transmission", 12, ' ') + StringUtils.center("Doors", 12, ' ') + StringUtils.center("Seats", 8, ' ') + StringUtils.center("Price per day", 16, ' ') + StringUtils.center("Car Size", 12, ' '));
    int i = 1;
    for (Car car : carRentals.getCars()) {
        if (!car.isRented()) {
            System.out.println(i + "." + StringUtils.center(car.getMake(), 14, " ") + StringUtils.center(car.getModel(), 16, " ") + StringUtils.center(car.getFuelType(), 14, " ")
                    + StringUtils.center(car.getGearbox(), 14, " ") + StringUtils.center(String.valueOf(car.getNoOfDoors()), 10, ' ') + StringUtils.center(String.valueOf(car.getNoOfSeats()), 10, ' ')
                    + StringUtils.center(String.valueOf(car.getPricePerDay()), 12, ' ') + StringUtils.center(car.getCarType(), 20, " "));
        } else {
            continue;
        }
        i++;
    }
}
    //print all extra options
    public static void showAllExtras(RentalShop carRentals ) {
        int i = 1;
        System.out.println(StringUtils.center("  Extra Option", 20, " ") + StringUtils.center("Price", 10, " "));
        for (ExtraOptions extraOption : carRentals.getExtras()) {
            System.out.println(i + "." + StringUtils.center(extraOption.getName(), 18, " ") + StringUtils.center(String.valueOf(extraOption.getPrice()), 10, " "));
            i++;
        }
    }
}
