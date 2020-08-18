package ro.jademy.carrentalshop.model.user;

import java.time.LocalDate;

public interface Payable {

    // calculate rental period
    int calculateNoOfDays( String startDate, String endDate);

    // calculate fee to be paid
    //car value + extra options if existent * no of days

    void calculateFee();

    // if driver age < 27 years ->10% penalty
    // if 27 <= driver age <= 45 -> no discount
    // if driver age > 45 ->10% discount
    // if calculateNoOfDays >= 5 days 5% discount
    // if calculateNoOfDays >= 10 days 10% discount
    // combine age and duration discounts
    void applyDiscount();
}
