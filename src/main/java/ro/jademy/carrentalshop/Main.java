package ro.jademy.carrentalshop;

import ro.jademy.carrentalshop.data.CarBuilder;
import ro.jademy.carrentalshop.data.ExtrasBuilder;
import ro.jademy.carrentalshop.model.RentalShop;
import ro.jademy.carrentalshop.model.user.Client;
import ro.jademy.carrentalshop.model.user.UserList;


public class Main {
    public static void main(String[] args) {
        // create a shop that contains
        // a shop admin
        // a list of users
        // a list of cars

        RentalShop autovit = new RentalShop(ExtrasBuilder.getAllExtras(), CarBuilder.getAllCars(), UserList.getAllUsers());
        Client c1 = (Client) autovit.getUsers().get(0);
        //c1.calculateNoOfDays("22-08-2020","27-08-2020");
        autovit.login();


    }
}
