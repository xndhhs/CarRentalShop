package ro.jademy.carrentalshop.services;

import ro.jademy.carrentalshop.model.user.User;

import java.util.List;

public interface AuthService {

    User login(List<User> users, String username, String password);

}
