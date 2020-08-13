package ro.jademy.carrentalshop;

import ro.jademy.carrentalshop.data.CarBuilder;
import ro.jademy.carrentalshop.data.ExtrasBuilder;
import ro.jademy.carrentalshop.model.RentalShop;
import ro.jademy.carrentalshop.model.cars.ExtraOptions;
import ro.jademy.carrentalshop.model.user.UserList;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // create a shop that contains
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
        autovit.sortByMake(autovit);
        System.out.println("\n\n\n");
        autovit.sortByModel(autovit);
        System.out.println("\n\n\n");
        autovit.sortByFuelType(autovit);
        System.out.println("\n\n\n");
        autovit.sortByGearbox(autovit);
        System.out.println("\n\n\n");
        autovit.sortByCategory(autovit);
        System.out.println("\n\n\n");
        RentalShop.showAllExtras(autovit);
        System.out.println("\n\n\n");
        // ClientProfile.userRentsExtraOption(autovit);
        //autovit.login(autovit.getUsers());

        RentalShop.showClientMenu(autovit);

    }
}
