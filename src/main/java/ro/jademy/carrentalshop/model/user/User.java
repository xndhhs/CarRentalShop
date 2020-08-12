package ro.jademy.carrentalshop.model.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    //user can login
    //access a menu for actions (see cars, rent a car, return a car, calculate rates)
    private String userName;
    private String userPass;
    private String firstName;
    private String lastName;

    public User( String userName, String userPass, String firstName, String lastName ) {
        this.userName = userName;
        this.userPass = userPass;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName( String userName ) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass( String userPass ) {
        this.userPass = userPass;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }

    public User() {
    }
}




