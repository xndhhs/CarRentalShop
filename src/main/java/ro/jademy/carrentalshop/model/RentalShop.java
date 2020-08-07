package ro.jademy.carrentalshop.model;

import ro.jademy.carrentalshop.model.cars.Car;
import ro.jademy.carrentalshop.model.user.ShopSalesman;
import ro.jademy.carrentalshop.model.user.User;

import java.util.ArrayList;

public class RentalShop {
    ShopSalesman shopOwner;
    ArrayList<Car> cars;
    ArrayList<User> users;
}
