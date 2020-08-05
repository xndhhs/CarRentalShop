package ro.jademy.carrentalshop.data;

public interface Sortable {
    //implement methods to sort by different criteria
    default void sortByMake() {

    }
    default void sortByCategory() {

    }
    default void sortByGearbox() {

    }
    default void sortByFuelType() {

    }
    default void sortByNoOfSeats() {

    }
    default void sortByAvailability() {
    //remove unavailable cars
    }

}
