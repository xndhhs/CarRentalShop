package ro.jademy.carrentalshop.model.user;

public class ShopSalesman extends User implements CustomerStatistics {
    public ShopSalesman(String userName, String userPass, String firstName, String lastName) {
        super(userName, userPass, firstName, lastName);
    }
    // see which cars are rented and by whom
    // see when do cars have to be returned
    // see income to be gained from all rentals
    //see a number of cars rented by each user and average number /user


}
