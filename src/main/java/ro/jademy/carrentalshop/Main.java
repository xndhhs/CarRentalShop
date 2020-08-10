package ro.jademy.carrentalshop;

import ro.jademy.carrentalshop.model.RentalShop;
import ro.jademy.carrentalshop.model.cars.Car;
import ro.jademy.carrentalshop.data.*;
import org.apache.commons.lang3.StringUtils;
import ro.jademy.carrentalshop.model.cars.ExtraOptions;
import ro.jademy.carrentalshop.model.user.UserList;

import java.sql.SQLOutput;


public class Main {
    public static void main( String[] args ) {
        //create a shop that contains
        // a shop admin
        // a list of users
        // a list of cars
        RentalShop autovit = new RentalShop(ExtrasBuilder.getAllExtras(), CarBuilder.getAllCars(), UserList.getAllUsers());
        RentalShop.showAllCars(autovit);
        System.out.println();
        System.out.println();
        System.out.println();
        UserList.showUserCategories();
        System.out.println();

        for (ExtraOptions extraOption : autovit.getExtras()) {
            System.out.println("Name: " + extraOption.getName() + "    Price: " + extraOption.getPrice());
        }
        System.out.println();
        System.out.println();
        System.out.println();
        RentalShop.showAllExtras(autovit);


    }
}
