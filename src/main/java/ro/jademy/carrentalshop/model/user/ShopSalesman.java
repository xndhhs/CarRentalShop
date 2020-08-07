package ro.jademy.carrentalshop.model.user;

import java.time.LocalDate;
import java.util.List;

public class ShopSalesman extends User implements CustomerStatistics{
    public ShopSalesman( String userName, String userPass, int age, List<RentedCar> carRentedHistory, LocalDate licenseGainedDate ) {
        super(userName, userPass, age, carRentedHistory, licenseGainedDate);
    }
    // see which cars are rented and by whom
    // see when do cars have to be returned
    // see income to be gained from all rentals

}
