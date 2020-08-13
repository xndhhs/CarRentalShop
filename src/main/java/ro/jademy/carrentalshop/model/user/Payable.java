package ro.jademy.carrentalshop.model.user;

public interface Payable {

    // calculate rental period
    void calculateNoOfDays();

    // calculate fee to be paid
    void calculateFee();

    // if driver age < 27 years ->10% penalty
    // if 27 <= driver age <= 45 -> no discount
    // if driver age > 45 ->10% discount
    // if calculateNoOfDays >= 5 days 5% discount
    // if calculateNoOfDays >= 10 days 10% discount
    // combine age and duration discounts
    void applyDiscount();
}
