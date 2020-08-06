package ro.jademy.carrentalshop.cars.mercedes;

import ro.jademy.carrentalshop.cars.Car;

public class MercedesBenz extends Car {
    private String make;

    public String getMake() {
        return make;
    }

    public void setMake( String make ) {
        this.make = make;
    }

    public MercedesBenz( String make ) {
        this.make = make;
    }
}
