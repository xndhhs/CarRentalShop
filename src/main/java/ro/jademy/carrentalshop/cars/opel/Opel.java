package ro.jademy.carrentalshop.cars.opel;

import ro.jademy.carrentalshop.cars.Car;

public class Opel extends Car {
    private String make;

    public String getMake() {
        return make;
    }

    public void setMake( String make ) {
        this.make = make;
    }

    public Opel( String make ) {
        this.make = make;
    }
}
