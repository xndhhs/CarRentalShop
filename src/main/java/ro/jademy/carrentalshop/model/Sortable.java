package ro.jademy.carrentalshop.model;

public interface Sortable {
    //implement methods to sort by different criteria
    void sortByMake(RentalShop carRentals);

    void sortByModel(RentalShop carRentals);

    void sortByFuelType(RentalShop carRentals);

    void sortByGearbox(RentalShop carRentals);

    void sortByCategory(RentalShop carRentals);

    void sortByPrice(RentalShop carRentals);

    //remove unavailable cars

}
