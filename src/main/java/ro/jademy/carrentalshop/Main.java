package ro.jademy.carrentalshop;
import ro.jademy.carrentalshop.cars.*;
import ro.jademy.carrentalshop.cars.toyota.ToyotaAygo;

import java.sql.SQLOutput;


public class Main {
    public static void main( String[] args ) {
    //create a shop that contains
        // a shop admin
        // a list of users
        // a list of cars
        Car car1 = new ToyotaAygo("Aygo","Manual","Gasoline",4,4,57.37, "Small",false);
        System.out.println(car1.getClass());
    }
}
