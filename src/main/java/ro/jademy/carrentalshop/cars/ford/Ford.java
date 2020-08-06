package ro.jademy.carrentalshop.cars.ford;

import ro.jademy.carrentalshop.cars.Car;

public class Ford extends Car {
    private String make;

    public String getMake() {
        return make;
    }

    public void setMake( String make ) {
        this.make = make;
    }

    public Ford( String make ) {
        this.make = make;
    }
}
