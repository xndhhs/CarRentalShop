package ro.jademy.carrentalshop.model.cars;

public class ExtraOptions {
    protected double price;
    protected String name;

    public ExtraOptions() {

    }

    public ExtraOptions(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
