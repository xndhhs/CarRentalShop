package ro.jademy.carrentalshop.model.user;

import ro.jademy.carrentalshop.services.CustomerStatisticsService;

import java.util.List;

public class Salesman extends User implements CustomerStatisticsService {
    public Salesman(String userName, String userPass, String firstName, String lastName) {
        super(userName, userPass, firstName, lastName);
    }

    @Override
    public int calculateMaxPricePaid( Client client ) {
        return 0;
    }

    @Override
    public int calculateMaxPricePaid( List<Client> client ) {
        return 0;
    }
    // see which cars are rented and by whom
    // see when do cars have to be returned
    // see income to be gained from all rentals
    //see a number of cars rented by each user and average number /user


}
