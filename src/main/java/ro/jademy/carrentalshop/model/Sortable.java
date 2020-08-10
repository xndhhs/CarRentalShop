package ro.jademy.carrentalshop.model;

public interface Sortable {
    //implement methods to sort by different criteria
    void sortByMake();

    void sortByCategory();

    void sortByGearbox();

    void sortByFuelType();

    void sortByNoOfSeats();

    void sortByAvailability();
    //remove unavailable cars

}
