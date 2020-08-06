package ro.jademy.carrentalshop.cars.toyota;

import ro.jademy.carrentalshop.cars.Car;

public class Toyota extends Car {
    public String make;

    public String getMake() {
        return make;
    }

    public void setMake( String make ) {
        this.make = make;
    }

    public Toyota( String make ) {
        this.make = make;
    }
}
