package ro.jademy.carrentalshop.data;

import org.apache.commons.lang3.StringUtils;
import ro.jademy.carrentalshop.model.cars.ExtraOptions;

import java.util.ArrayList;

public class ExtrasBuilder {

    public ExtrasBuilder() {
    }

    public static ArrayList<ExtraOptions> getAllExtras() {
        ArrayList<ExtraOptions> allExtraOptions = new ArrayList<>();
        ExtraOptions childSeat = new ExtraOptions("Child Seat", 50);
        ExtraOptions GPS = new ExtraOptions("GPS", 10);
        ExtraOptions secondDriver = new ExtraOptions("Second driver", 10);
        ExtraOptions winterTyres = new ExtraOptions("Winter tyres", 5);
        ExtraOptions skiRack = new ExtraOptions("Ski/Snowboard rack", 10);
        allExtraOptions.add(childSeat);
        allExtraOptions.add(GPS);
        allExtraOptions.add(secondDriver);
        allExtraOptions.add(winterTyres);
        allExtraOptions.add(skiRack);
        return allExtraOptions;
    }



}



