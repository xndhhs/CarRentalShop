package ro.jademy.carrentalshop.model;

import org.apache.commons.lang3.StringUtils;
import ro.jademy.carrentalshop.data.ExtrasBuilder;
import ro.jademy.carrentalshop.model.cars.Car;
import ro.jademy.carrentalshop.model.cars.ExtraOptions;
import ro.jademy.carrentalshop.model.user.Client;
import ro.jademy.carrentalshop.model.user.Salesman;
import ro.jademy.carrentalshop.model.user.User;
import ro.jademy.carrentalshop.services.AuthService;
import ro.jademy.carrentalshop.services.MemoryAuthServiceImpl;
import ro.jademy.carrentalshop.services.SortingService;
import ro.jademy.carrentalshop.services.SortingServiceImpl;

import java.util.List;
import java.util.Scanner;

public class RentalShop {
    static Scanner scanner = new Scanner(System.in);

    private List<ExtraOptions> extras;
    private List<Car> cars;
    private List<User> users;

    private User currentUser;

    private SortingService sortingService = new SortingServiceImpl();
    private AuthService authService = new MemoryAuthServiceImpl();

    public RentalShop(List<ExtraOptions> extras, List<Car> cars, List<User> users) {
        this.extras = extras;
        this.cars = cars;
        this.users = users;
    }

    // sort cars by:make, fuel,gearbox,type(size), price
    // print raw car data
    public void showAllCars() {
        showAllCars(cars);
    }

    public void showAllCars(List<Car> cars) {
        System.out.println(getCarHeader());
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if (!car.isRented()) {
                String padding = i < 9 ? " " : "";
                System.out.println(padding + (i + 1) + ". " + car);
            }
        }
    }

    private static String getCarHeader() {
        return StringUtils.center("  MAKE", 16, " ") +
                StringUtils.center("  MODEL", 16, " ") +
                StringUtils.center("FUEL TYPE", 16, ' ') +
                StringUtils.center("TRANSMISSION", 12, ' ') +
                StringUtils.center("DOORS", 12, ' ') +
                StringUtils.center("SEATS", 8, ' ') +
                StringUtils.center("PRICE PER DAY", 16, ' ') +
                StringUtils.center("CAR SIZE", 12, ' ');
    }

    // print all extra options
    public void showAllExtras() {
        System.out.println(StringUtils.center("  Extra Option", 20, " ") + StringUtils.center("Price", 10, " "));
        for (int i = 0; i < extras.size(); i++) {
            System.out.println((i + 1) + "." + StringUtils.center(extras.get(i).getName(), 18, " ") + StringUtils.center(String.valueOf(extras.get(i).getPrice()), 10, " "));
        }
    }

    public void showClientMenu() {
        System.out.println(" -------------------------------------");
        System.out.println("|    Welcome to the Car Rental Shop   |");
        System.out.println(" -------------------------------------");
        System.out.println();
        System.out.println("          MAIN MENU      ");
        System.out.println("1. List all available cars");
        System.out.println("2. Sort cars");
        System.out.println("3. Rent a car");
        System.out.println("4. Show car history");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
        System.out.println("\n");
        System.out.println("Choose your option:");
        String option = scanner.nextLine();
        switch (option) {
            case ("1"):
                //show all available cars
                showAllCars();
                System.out.println("Press B to go back to the main menu");
                option = scanner.nextLine();
                while (!option.equalsIgnoreCase("b")) {
                    System.out.println("Press B to go back to the main menu");
                    option = scanner.nextLine();
                }
                showClientMenu();
                break;
            case ("2"):
                showClientSubMenu();
                break;
            case ("3"):
                break;
            case ("4"):
                break;
            case ("5"):
                login();
                break;
            case ("6"):
                break;
            default:
                System.out.println("Unknown option: " + option);
                break;
        }
    }

    public void showClientSubMenu() {

        System.out.println("1. Sort cars by make");
        System.out.println("2. Sort cars by model");
        System.out.println("3. Sort cars by fuel type");
        System.out.println("4. Sort cars by gearbox");
        System.out.println("5. Sort cars by size");
        System.out.println("Choose your option or press B to go back:");
        String option = scanner.nextLine();

        switch (option.toLowerCase()) {
            case ("1"):
                //sort cars by make
                showAllCars(sortingService.sortByMake(cars));
                System.out.println("Press B to go back to the main menu");
                option = scanner.nextLine();
                while (!option.equalsIgnoreCase("b")) {
                    System.out.println("Press B to go back to the main menu");
                    option = scanner.nextLine();
                }
                showClientSubMenu();
                break;
            case ("2"):
                break;
            case ("3"):
                break;
            case ("4"):
                break;
            case ("5"):
                break;
            case ("b"):
                showClientMenu();
                break;
            default:
                System.out.println("Unknown option: " + option);
                break;
        }
    }

    public static void showSalesmanMenu() {
        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Car Rental Shop ADMIN Page  |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("          MAIN MENU      ");
        System.out.println("1. Show current rented cars");
        System.out.println("2. Statistics - number of cars rented");
        System.out.println("3. Statistics - money spent");
        System.out.println("4. Statistics - rented cars");
        System.out.println("5. Statistics - preferred brands and sizes");
        System.out.println("6. Statistics - rented cars");
        System.out.println("7. Statistics - client info (age, license seniority)");
        System.out.println("8. Logout");
        System.out.println("9. Exit");
    }

    public void showMenu() {
        if (currentUser instanceof Client) {
            showClientMenu();
        } else if (currentUser instanceof Salesman) {
            showSalesmanMenu();
        }
    }

    public void login() {
        do {
            System.out.println("Please enter the username: ");
            String userName = scanner.nextLine();
            System.out.println("Please enter the password: ");
            String pass = scanner.nextLine();

            currentUser = authService.login(users, userName, pass);

            if (currentUser == null) {
                System.out.println("Incorrect Username/Password!");
            }

        } while (currentUser == null);

        System.out.println("Login successful! Welcome, " + currentUser.getFullName() + "!");
        System.out.println();

        showMenu();
    }

    public List<ExtraOptions> getExtras() {
        return extras;
    }

    public void setExtras(List<ExtraOptions> extras) {
        this.extras = ExtrasBuilder.getAllExtras();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


}
