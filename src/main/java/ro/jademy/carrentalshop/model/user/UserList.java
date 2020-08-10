package ro.jademy.carrentalshop.model.user;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class UserList {
    public static ArrayList<User> getAllClients() {
        ArrayList<User> allClients = new ArrayList<>();
        User client1 = new ClientProfile("client1", "1111", "Ion", "Ionescu", LocalDate.of(2012, Month.JANUARY, 15), 33);
        User client2 = new ClientProfile("client2", "2222", "George", "Georgescu", LocalDate.of(2018, Month.JANUARY, 15), 22);
        User client3 = new ClientProfile("client3", "3333", "Maria", "Popescu", LocalDate.of(2009, Month.JANUARY, 15), 45);
        User client4 = new ClientProfile("client4", "4444", "Ioana", "Petre", LocalDate.of(2011, Month.JANUARY, 15), 31);
        User client5 = new ClientProfile("client5", "5555", "Andrei", "Calin", LocalDate.of(1999, Month.JANUARY, 15), 58);
        allClients.add(client1);
        allClients.add(client2);
        allClients.add(client3);
        allClients.add(client4);
        allClients.add(client5);
        return allClients;
    }

    public static ArrayList<User> getAllSalesmen() {
        ArrayList<User> allSalesmen = new ArrayList<>();
        User salesman1 = new ShopSalesman("salesman1", "6666", "Alex", "Manole");
        User salesman2 = new ShopSalesman("salesman2", "7777", "Diana", "Sorescu");
        allSalesmen.add(salesman1);
        allSalesmen.add(salesman2);
        return allSalesmen;
    }

    public static ArrayList<User> getAllUsers() {
        ArrayList<User> allUsers = new ArrayList<>();
        allUsers = getAllClients();
        allUsers.addAll(getAllSalesmen());
        return allUsers;
    }

    public static void showUserCategories() {
        for (User user : getAllUsers()) {
            if (user instanceof ClientProfile) {
                System.out.println("Client -" + user.getUserName());
            } else if (user instanceof ShopSalesman) {
                System.out.println("Salesman -" + user.getUserName());
            }
        }
    }
}
