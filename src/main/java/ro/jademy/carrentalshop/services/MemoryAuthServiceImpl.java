package ro.jademy.carrentalshop.services;

import ro.jademy.carrentalshop.model.user.User;

import java.util.List;

public class MemoryAuthServiceImpl implements AuthService {

    public User login(List<User> users, String username, String password) {

            for (User user : users) {
                if (username.equalsIgnoreCase(user.getUserName()) && password.equals(user.getPassword())) {
                     return user;
                }
            }

            return null;
    }
}
