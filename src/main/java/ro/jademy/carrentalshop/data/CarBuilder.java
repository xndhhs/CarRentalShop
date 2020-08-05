package ro.jademy.carrentalshop.data;

import ro.jademy.carrentalshop.model.Car;
import ro.jademy.carrentalshop.model.SmallCar;

import java.util.ArrayList;

public class CarBuilder implements Sortable {
    public ArrayList<Car> carList = new ArrayList<>();
    Car car1 = new SmallCar("Toyota", "Aygo", "Manual", "Gasoline", 4, 57.73, "Small");
    Car car2 = new SmallCar("Seat", "Ibiza", "Manual", "Diesel", 5, 63.44, "Small");
    Car car3 = new SmallCar("Opel", "Corsa", "Automatic", "Diesel", 5, 153.03, "Small");
    Car car4 = new SmallCar("Renault", "Zoe", "Automatic", "Electric", 4, 257.14, "Small");
//    Car car5 = new Car("Ford", "Focus", "Manual", "Gasoline", 5, 145.65, "Medium");
//    Car car6 = new Car("Toyota", "Corolla", "Automatic", "Hybrid", 5, 171.07, "Medium");
//    Car car7 = new Car("Seat", "Leon", "Automatic", "Diesel", 5, 136.36, "Medium");
//    Car car8 = new Car("Dacia", "Logan", "Manual", "Gasoline", 5, 69.73, "Medium");
//    Car car9 = new Car("Skoda", "Octavia", "Automatic", "Diesel", 5, 222.56, "Large");
//    Car car10 = new Car("Volkswagen", "Passat", "Automatic", "Diesel", 5, 249.56, "Large");
//    Car car11 = new Car("Mercedes-Benz", "C-Class", "Automatic", "Diesel", 5, 324.02, "Large");
//    Car car12 = new Car("Opel", "Vivaro", "Manual", "Gasoline", 9, 375.05, "Large");
//    Car car13 = new Car("Mercedes-Benz", "E-Class", "Automatic", "Diesel", 5, 375.05, "Large");
//    Car car14 = new Car("Dacia", "Lodgy", "Manual", "Gasoline", 7, 211.93, "Large");
//    Car car15 = new Car("Renault", "Captur", "Automatic", "Gasoline", 5, 136.36, "SUV");
//    Car car16 = new Car("Dacia", "Duster", "Manual", "Diesel", 5, 256.07, "SUV");
//    Car car17 = new Car("Nissan", "Qashqai", "Automatic", "Diesel", 5, 319.93, "SUV");
//    Car car18 = new Car("Ford", "Kuga", "Manual", "Diesel", 5, 227.14, "SUV");
//    Car car19 = new Car("Mercedes-Benz", "GLC", "Automatic", "Diesel", 5, 470.38, "SUV");

    @Override
    public void sortByMake() {

    }

    @Override
    public void sortByCategory() {

    }

    @Override
    public void sortByGearbox() {

    }

    @Override
    public void sortByFuelType() {

    }

    @Override
    public void sortByNoOfSeats() {

    }

    @Override
    public void sortByAvailability() {

    }
}
