package ro.jademy.carrentalshop.cars.dacia;

import ro.jademy.carrentalshop.cars.Car;

public class Dacia extends Car {
    private String make;

    public String getMake() {
        return make;
    }

    public void setMake( String make ) {
        this.make = make;
    }

    public Dacia( String make ) {
        this.make = make;
    }
}
