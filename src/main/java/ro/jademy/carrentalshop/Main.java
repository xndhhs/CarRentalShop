package ro.jademy.carrentalshop;

import ro.jademy.carrentalshop.data.CarBuilder;
import ro.jademy.carrentalshop.data.ExtrasBuilder;
import ro.jademy.carrentalshop.model.RentalShop;
import ro.jademy.carrentalshop.model.user.UserList;


public class Main {
    public static void main(String[] args) {
        // create a shop that contains
        // a shop admin
        // a list of users
        // a list of cars
        RentalShop autovit = new RentalShop(ExtrasBuilder.getAllExtras(), CarBuilder.getAllCars(), UserList.getAllUsers());
//        autovit.showAllCars();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        UserList.showUserCategories();
//        System.out.println();
//
//        for (ExtraOptions extraOption : autovit.getExtras()) {
//            System.out.println("Name: " + extraOption.getName() + "    Price: " + extraOption.getPrice());
//        }

        autovit.login();
    }
}
