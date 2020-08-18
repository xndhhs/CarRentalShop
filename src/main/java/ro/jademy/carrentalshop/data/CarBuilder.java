package ro.jademy.carrentalshop.data;

import ro.jademy.carrentalshop.model.cars.Car;
import ro.jademy.carrentalshop.model.cars.dacia.DaciaDuster;
import ro.jademy.carrentalshop.model.cars.dacia.DaciaLodgy;
import ro.jademy.carrentalshop.model.cars.dacia.DaciaLogan;
import ro.jademy.carrentalshop.model.cars.ford.FordFocus;
import ro.jademy.carrentalshop.model.cars.ford.FordKuga;
import ro.jademy.carrentalshop.model.cars.mercedes.MercedesBenzEClass;
import ro.jademy.carrentalshop.model.cars.mercedes.MercedesBenzGLC;
import ro.jademy.carrentalshop.model.cars.opel.OpelCorsa;
import ro.jademy.carrentalshop.model.cars.opel.OpelGrandland;
import ro.jademy.carrentalshop.model.cars.opel.OpelVivaro;
import ro.jademy.carrentalshop.model.cars.renault.RenaultCaptur;
import ro.jademy.carrentalshop.model.cars.renault.RenaultZoe;
import ro.jademy.carrentalshop.model.cars.toyota.ToyotaAygo;
import ro.jademy.carrentalshop.model.cars.toyota.ToyotaCorolla;
import ro.jademy.carrentalshop.model.cars.toyota.ToyotaYaris;

import java.util.ArrayList;
import java.util.List;

public class CarBuilder {


    public static List<Car> getAllCars() {
        List<Car> carList = new ArrayList<>();
        //Toyota
        Car aygo1 = new ToyotaAygo("Aygo", "Manual", "Gasoline", 4, 4, 5773, "Small");
        Car yaris1 = new ToyotaYaris("Yaris", "Automatic", "Hybrid", 4, 4, 6344, "Small");
        Car corolla1 = new ToyotaCorolla("Corolla", "Automatic", "Hybrid", 4, 5, 13636, "Medium");
        Car avensis1 = new ToyotaCorolla("Avensis", "Automatic", "Hybrid", 4, 5, 17107, "Large");
        //Dacia
        Car logan1 = new DaciaLogan("Logan", "Manual", "Gasoline", 4, 5, 6973, "Medium");
        Car lodgy1 = new DaciaLodgy("Lodgy", "Manual", "Gasoline", 4, 7, 21193, "Large");
        Car duster1 = new DaciaDuster("Duster", "Manual", "Diesel", 4, 5, 25607, "SUV");
        //Ford
        Car focus1 = new FordFocus("Focus", "Manual", "Gasoline", 4, 5, 14565, "Medium");
        Car kuga1 = new FordKuga("Kuga", "Manual", "Diesel", 4, 5, 22714, "SUV");
        //Opel
        Car grandland1 = new OpelGrandland("Grandland", "Automatic", "Diesel", 4, 5, 31993, "SUV");
        Car vivaro1 = new OpelVivaro("Vivaro", "Manual", "Gasoline", 4, 9, 37505, "Large");
        Car corsa1 = new OpelCorsa("Corsa", "Automatic", "Diesel", 4, 4, 15303, "Small");
        //Mercedes
        Car GLC1 = new MercedesBenzGLC("GLC", "Automatic", "Diesel", 4, 5, 47038, "SUV");
        Car Eclass1 = new MercedesBenzEClass("E-Class", "Automatic", "Diesel", 4, 5, 37505, "Large");
        Car Cclass1 = new MercedesBenzEClass("C-Class", "Automatic", "Diesel", 4, 5, 32402, "Large");
        //Renault
        Car captur1 = new RenaultCaptur("Captur", "Automatic", "Gasoline", 4, 5, 13636, "SUV");
        Car megane1 = new RenaultCaptur("Megane", "Automatic", "Gasoline", 4, 5, 22256, "Large");
        Car zoe1 = new RenaultZoe("Zoe", "Automatic", "Electric", 4, 4, 25714, "Small");
//        logan1.setRented(true);
//        captur1.setRented(true);
//        GLC1.setRented(true);
        carList.add(aygo1);
        carList.add(yaris1);
        carList.add(corolla1);
        carList.add(avensis1);
        carList.add(logan1);
        carList.add(lodgy1);
        carList.add(duster1);
        carList.add(focus1);
        carList.add(kuga1);
        carList.add(grandland1);
        carList.add(vivaro1);
        carList.add(corsa1);
        carList.add(GLC1);
        carList.add(Eclass1);
        carList.add(Cclass1);
        carList.add(captur1);
        carList.add(megane1);
        carList.add(zoe1);
        return carList;
    }

}

