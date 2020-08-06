package ro.jademy.carrentalshop.cars.renault;

import ro.jademy.carrentalshop.cars.Car;

public class Renault extends Car {
    private String make;

    public String getMake() {
        return make;
    }

    public void setMake( String make ) {
        this.make = make;
    }

    public Renault( String make ) {
        this.make = make;
    }
}
