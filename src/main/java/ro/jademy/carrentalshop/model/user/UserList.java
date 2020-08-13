package ro.jademy.carrentalshop.model.user;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class UserList {
    public static List<User> getAllClients() {
        List<User> allClients = new ArrayList<>();
        User client1 = new Client("client1", "1111", "Ion", "Ionescu", LocalDate.of(2012, Month.JANUARY, 15), 33);
        User client2 = new Client("client2", "2222", "George", "Georgescu", LocalDate.of(2018, Month.JANUARY, 15), 22);
        User client3 = new Client("client3", "3333", "Maria", "Popescu", LocalDate.of(2009, Month.JANUARY, 15), 45);
        User client4 = new Client("client4", "4444", "Ioana", "Petre", LocalDate.of(2011, Month.JANUARY, 15), 31);
        User client5 = new Client("client5", "5555", "Andrei", "Calin", LocalDate.of(1999, Month.JANUARY, 15), 58);
        allClients.add(client1);
        allClients.add(client2);
        allClients.add(client3);
        allClients.add(client4);
        allClients.add(client5);
        return allClients;
    }

    public static List<User> getAllSalesmen() {
        List<User> allSalesmen = new ArrayList<>();
        User salesman1 = new Salesman("salesman1", "6666", "Alex", "Manole");
        User salesman2 = new Salesman("salesman2", "7777", "Diana", "Sorescu");
        allSalesmen.add(salesman1);
        allSalesmen.add(salesman2);
        return allSalesmen;
    }

    public static List<User> getAllUsers() {
        List<User> allUsers = getAllClients();
        allUsers.addAll(getAllSalesmen());
        return allUsers;
    }

    public static void showUserCategories() {
        for (User user : getAllUsers()) {
            if (user instanceof Client) {
                System.out.println("Client -" + user.getUserName());
            } else if (user instanceof Salesman) {
                System.out.println("Salesman -" + user.getUserName());
            }
        }
    }
}
