package ro.jademy.carrentalshop.model;


import org.apache.commons.lang3.StringUtils;
import ro.jademy.carrentalshop.data.ExtrasBuilder;
import ro.jademy.carrentalshop.model.cars.Car;
import ro.jademy.carrentalshop.model.cars.ExtraOptions;
import ro.jademy.carrentalshop.model.user.Client;
import ro.jademy.carrentalshop.model.user.RentedCar;
import ro.jademy.carrentalshop.model.user.Salesman;
import ro.jademy.carrentalshop.model.user.User;
import ro.jademy.carrentalshop.services.AuthService;
import ro.jademy.carrentalshop.services.MemoryAuthServiceImpl;
import ro.jademy.carrentalshop.services.SortingService;
import ro.jademy.carrentalshop.services.SortingServiceImpl;
import ro.jademy.carrentalshop.util.InputUtils;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class RentalShop {
    static Scanner scanner = new Scanner(System.in);

    private List<ExtraOptions> extras;
    private List<Car> cars;
    private List<User> users;

    private User currentUser;

    private SortingService sortingService = new SortingServiceImpl();
    private AuthService authService = new MemoryAuthServiceImpl();

    public RentalShop( List<ExtraOptions> extras, List<Car> cars, List<User> users ) {
        this.extras = extras;
        this.cars = cars;
        this.users = users;
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

    // sort cars by:make, fuel,gearbox,type(size), price
    // print raw car data
    public void showAllCars() {
        showAllCars(cars);
    }

    public void showAllCars( List<Car> cars ) {
        System.out.println(getCarHeader());
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if (!car.isRented()) {
                String padding = i < 9 ? " " : "";
                System.out.println(padding + (i + 1) + ". " + car);
            }
        }
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
                while ( !option.equalsIgnoreCase("b") ) {
                    System.out.println("Press B to go back to the main menu");
                    option = scanner.nextLine();
                }
                showClientMenu();
                break;
            case ("2"):
                showClientSubMenu();
                break;
            case ("3"):
                showAllCars();
                System.out.println("Enter the number of the car you wish to rent:");
                option = scanner.nextLine();
                System.out.println("Enter the start date (DD-MM-YYYY format): ");
                String startDate = scanner.nextLine();
                System.out.println("Enter the end date (DD-MM-YYYY format): ");
                String endDate = scanner.nextLine();
                System.out.println("Do you wish to add extra options? Y/N");
                String extraOptionAnswer = scanner.nextLine();
                if (extraOptionAnswer.equalsIgnoreCase("y")) {
                    ((Client) currentUser).rentExtraOptions(getExtras(), InputUtils.parseStringInput(extraOptionAnswer, ","));
                }
                Client c1 = (Client) currentUser;
                int noOfDays = c1.calculateNoOfDays(startDate, endDate);
                System.out.println(noOfDays);
                RentedCar rentedCar = new RentedCar();

                c1.getCarRentedHistory().add(rentedCar);
                rentedCar.setPickupDate(InputUtils.formatDate(startDate));
                rentedCar.setReturnDate(InputUtils.formatDate(endDate));
                rentedCar.setRentedCar(getCars().get(parseInt(option) - 1));
                rentedCar.setRented(true);
                rentedCar.getRentedCar().setRented(true);
                double carPrice = (noOfDays * (getCars().get(parseInt(option) - 1).getPricePerDay())) / 100;
                rentedCar.setAmountToPayRON(carPrice);
                double carPriceEUR = carPrice / 4.82;
                rentedCar.setAmountToPayEUR(carPriceEUR);
                System.out.println(carPrice + "   " + carPriceEUR);
                showClientMenu();
                break;
            case ("4"):
                //show current rented car
                c1 = (Client) currentUser;
                if (c1.getCarRentedHistory().isEmpty()) {
                    System.out.println("You have no rented cars!\n");
                    showClientMenu();
                } else {
                    for (RentedCar rentedCar1 : c1.getCarRentedHistory()) {
                        if (rentedCar1.isRented()) {
                            System.out.println("Current Car: " + rentedCar1.getRentedCar().getMake() + rentedCar1.getRentedCar().getMake() +
                                    "from " + rentedCar1.getPickupDate() + " until " + rentedCar1.getReturnDate());
                        }
                    }

                    System.out.println("Do you wish to return the car? Y/N");
                    String returnAnswer = scanner.nextLine();
                    if (returnAnswer.equalsIgnoreCase("y")) {
                        for (RentedCar rentedCar1 : c1.getCarRentedHistory()) {
                            if (rentedCar1.isRented()) {
                                rentedCar1.setRented(false);
                                System.out.println("Car has been returned");
                                showClientMenu();
                            }
                        }
                    }
                }
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
        System.out.println("6. Sort cars by price");
        System.out.println("Choose your option or press B to go back:");
        String option = scanner.nextLine();

        switch (option.toLowerCase()) {
            case ("1"):
                //sort cars by make
                showAllCars(sortingService.sortByMake(cars));
                System.out.println("Press B to go back to the main menu");
                option = scanner.nextLine();
                while ( !option.equalsIgnoreCase("b") ) {
                    System.out.println("Press B to go back to the main menu");
                    option = scanner.nextLine();
                }
                showClientSubMenu();
                break;
            case ("2"):
                //sort cars by model
                showAllCars(sortingService.sortByModel(cars));
                System.out.println("Press B to go back to the main menu");
                option = scanner.nextLine();
                while ( !option.equalsIgnoreCase("b") ) {
                    System.out.println("Press B to go back to the main menu");
                    option = scanner.nextLine();
                }
                showClientSubMenu();
                break;
            case ("3"):
                //sort cars by fuel type
                showAllCars(sortingService.sortByFuelType(cars));
                System.out.println("Press B to go back to the main menu");
                option = scanner.nextLine();
                while ( !option.equalsIgnoreCase("b") ) {
                    System.out.println("Press B to go back to the main menu");
                    option = scanner.nextLine();
                }
                showClientSubMenu();
                break;
            case ("4"):
                //sort cars by gearbox
                showAllCars(sortingService.sortByGearbox(cars));
                System.out.println("Press B to go back to the main menu");
                option = scanner.nextLine();
                while ( !option.equalsIgnoreCase("b") ) {
                    System.out.println("Press B to go back to the main menu");
                    option = scanner.nextLine();
                }
                showClientSubMenu();
            case ("5"):
                //sort cars by size
                showAllCars(sortingService.sortByCategory(cars));
                System.out.println("Press B to go back to the main menu");
                option = scanner.nextLine();
                while ( !option.equalsIgnoreCase("b") ) {
                    System.out.println("Press B to go back to the main menu");
                    option = scanner.nextLine();
                }
                showClientSubMenu();
            case ("6"):
                //sort cars by price
                showAllCars(sortingService.sortByPrice(cars));
                System.out.println("Press B to go back to the main menu");
                option = scanner.nextLine();
                while ( !option.equalsIgnoreCase("b") ) {
                    System.out.println("Press B to go back to the main menu");
                    option = scanner.nextLine();
                }
                showClientSubMenu();
            case ("b"):
                showClientMenu();
                break;
            default:
                System.out.println("Unknown option: " + option);
                break;
        }
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

        } while ( currentUser == null );

        System.out.println("Login successful! Welcome, " + currentUser.getFullName() + "!");
        System.out.println();

        showMenu();
    }

    public void calculateRentedCarPrice( String option, String startDate, String endDate, List<ExtraOptions> extraOptionsList ) {

    }

    public List<ExtraOptions> getExtras() {
        return extras;
    }

    public void setExtras( List<ExtraOptions> extras ) {
        this.extras = ExtrasBuilder.getAllExtras();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars( List<Car> cars ) {
        this.cars = cars;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers( List<User> users ) {
        this.users = users;
    }


}
