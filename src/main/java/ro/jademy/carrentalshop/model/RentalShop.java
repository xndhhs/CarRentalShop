package ro.jademy.carrentalshop.model;

import org.apache.commons.lang3.StringUtils;
import ro.jademy.carrentalshop.data.ExtrasBuilder;
import ro.jademy.carrentalshop.model.cars.Car;
import ro.jademy.carrentalshop.model.cars.ExtraOptions;
import ro.jademy.carrentalshop.model.user.User;

import java.util.List;
import java.util.Scanner;

public class RentalShop implements Sortable {
    static Scanner scanner = new Scanner(System.in);
    List<ExtraOptions> extras;
    List<Car> cars;
    List<User> users;

    public RentalShop() {

    }

    public RentalShop(List<ExtraOptions> extras, List<Car> cars, List<User> users) {
        this.extras = extras;
        this.cars = cars;
        this.users = users;
    }

    //    sort cars by:make, fuel,gearbox,type(size), price
//print raw car data

    public static void showAllCars(RentalShop carRentals) {
        System.out.println(StringUtils.center("  Make", 16, " ") + StringUtils.center("  Model", 16, " ") + StringUtils.center("Fuel type", 16, ' ')
                + StringUtils.center("Transmission", 12, ' ') + StringUtils.center("Doors", 12, ' ') + StringUtils.center("Seats", 8, ' ') + StringUtils.center("Price per day", 16, ' ') + StringUtils.center("Car Size", 12, ' '));
        int i = 1;
        for (Car car : carRentals.getCars()) {
            if (!car.isRented()) {
                System.out.println(i + "." + StringUtils.center(car.getMake(), 14, " ") + StringUtils.center(car.getModel(), 16, " ") + StringUtils.center(car.getFuelType(), 14, " ")
                        + StringUtils.center(car.getGearbox(), 14, " ") + StringUtils.center(String.valueOf(car.getNoOfDoors()), 10, ' ') + StringUtils.center(String.valueOf(car.getNoOfSeats()), 10, ' ')
                        + StringUtils.center(String.valueOf(car.getPricePerDay()), 12, ' ') + StringUtils.center(car.getCarType(), 20, " "));
            } else {
                continue;
            }
            i++;
        }
    }

    //print all extra options
    public static void showAllExtras(RentalShop carRentals) {
        int i = 1;
        System.out.println(StringUtils.center("  Extra Option", 20, " ") + StringUtils.center("Price", 10, " "));
        for (ExtraOptions extraOption : carRentals.getExtras()) {
            System.out.println(i + "." + StringUtils.center(extraOption.getName(), 18, " ") + StringUtils.center(String.valueOf(extraOption.getPrice()), 10, " "));
            i++;
        }
    }

    public static void showClientMenu(RentalShop carRentals) {
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
        String temp = scanner.nextLine();
        Car currentCar = null;
        switch (temp) {
            case ("1"):
                //show all available cars
                showAllCars(carRentals);
                System.out.println("Press B to go back to the main menu");
                temp = scanner.nextLine();
                while (!temp.equalsIgnoreCase("b")) {
                    System.out.println("Press B to go back to the main menu");
                    temp = scanner.nextLine();
                }
                showClientMenu(carRentals);
            case ("2"):
                showClientSubMenu(carRentals);
            case ("3"):
            case ("4"):
            case ("5"):
                carRentals.login(carRentals);
            case ("6"):
        }
    }

    public static void showClientSubMenu(RentalShop carRentals) {

        System.out.println("1. Sort cars by make");
        System.out.println("2. Sort cars by model");
        System.out.println("3. Sort cars by fuel type");
        System.out.println("4. Sort cars by gearbox");
        System.out.println("5. Sort cars by size");
        System.out.println("Choose your option or press B to go back:");
        String temp = scanner.nextLine();
        switch (temp) {
            case ("1"):
                //sort cars by make
                carRentals.sortByMake(carRentals);
                System.out.println("Press B to go back to the main menu");
                temp = scanner.nextLine();
                while (!temp.equalsIgnoreCase("b")) {
                    System.out.println("Press B to go back to the main menu");
                    temp = scanner.nextLine();
                }
                showClientSubMenu(carRentals);
            case ("2"):

            case ("3"):
            case ("4"):
            case ("5"):
            case ("b"):
                showClientMenu(carRentals);
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


//        String temp = scanner.nextLine();
//        Car currentCar = null;
    }

//    public static void showMenu( User user ) {
//        if (user instanceof ClientProfile) {
//           showClientMenu();
//        } else if (user instanceof ShopSalesman) {
//         showSalesmanMenu();
//        }
//    }

    public User login(RentalShop carRentals) {
        boolean login = false;
        User currentUser = null;
        do {
            System.out.println("Please enter the username: ");
            String userName = scanner.nextLine();
            System.out.println("Please enter the password: ");
            String pass = scanner.nextLine();

            for (User userItem : carRentals.getUsers()) {
                if (userName.equalsIgnoreCase(userItem.getUserName()) && pass.equals(userItem.getUserPass())) {
                    System.out.println("Login successful! Welcome, " + userItem.getFirstName() + " " + userItem.getLastName() + "!");
                    login = true;
                    currentUser = userItem;

                }
            }
            if (!login) {
                System.out.println("Incorrect Username/Password!");
            }

        } while (!login);
        return currentUser;
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

    @Override
    public void sortByMake(RentalShop carRentals) {
        carRentals.cars.sort((o1, o2) -> o1.getMake().compareTo(o2.getMake()));
        System.out.println(StringUtils.center("  Make", 16, " ") + StringUtils.center("  Model", 16, " ") + StringUtils.center("Fuel type", 16, ' ')
                + StringUtils.center("Transmission", 12, ' ') + StringUtils.center("Doors", 12, ' ') + StringUtils.center("Seats", 8, ' ') + StringUtils.center("Price per day", 16, ' ') + StringUtils.center("Car Size", 12, ' '));
        int i = 1;
        for (Car car : carRentals.getCars()) {
            if (!car.isRented()) {
                System.out.println(i + "." + StringUtils.center(car.getMake(), 14, " ") + StringUtils.center(car.getModel(), 16, " ") + StringUtils.center(car.getFuelType(), 14, " ")
                        + StringUtils.center(car.getGearbox(), 14, " ") + StringUtils.center(String.valueOf(car.getNoOfDoors()), 10, ' ') + StringUtils.center(String.valueOf(car.getNoOfSeats()), 10, ' ')
                        + StringUtils.center(String.valueOf(car.getPricePerDay()), 12, ' ') + StringUtils.center(car.getCarType(), 20, " "));
            } else {
                continue;
            }
            i++;
        }
    }

    @Override
    public void sortByModel(RentalShop carRentals) {
        carRentals.cars.sort((o1, o2) -> o1.getModel().compareTo(o2.getModel()));
        System.out.println(StringUtils.center("  Make", 16, " ") + StringUtils.center("  Model", 16, " ") + StringUtils.center("Fuel type", 16, ' ')
                + StringUtils.center("Transmission", 12, ' ') + StringUtils.center("Doors", 12, ' ') + StringUtils.center("Seats", 8, ' ') + StringUtils.center("Price per day", 16, ' ') + StringUtils.center("Car Size", 12, ' '));
        int i = 1;
        for (Car car : carRentals.getCars()) {
            if (!car.isRented()) {
                System.out.println(i + "." + StringUtils.center(car.getMake(), 14, " ") + StringUtils.center(car.getModel(), 16, " ") + StringUtils.center(car.getFuelType(), 14, " ")
                        + StringUtils.center(car.getGearbox(), 14, " ") + StringUtils.center(String.valueOf(car.getNoOfDoors()), 10, ' ') + StringUtils.center(String.valueOf(car.getNoOfSeats()), 10, ' ')
                        + StringUtils.center(String.valueOf(car.getPricePerDay()), 12, ' ') + StringUtils.center(car.getCarType(), 20, " "));
            } else {
                continue;
            }
            i++;
        }
    }

    @Override
    public void sortByFuelType(RentalShop carRentals) {
        carRentals.cars.sort((o1, o2) -> o1.getFuelType().compareTo(o2.getFuelType()));
        System.out.println(StringUtils.center("  Make", 16, " ") + StringUtils.center("  Model", 16, " ") + StringUtils.center("Fuel type", 16, ' ')
                + StringUtils.center("Transmission", 12, ' ') + StringUtils.center("Doors", 12, ' ') + StringUtils.center("Seats", 8, ' ') + StringUtils.center("Price per day", 16, ' ') + StringUtils.center("Car Size", 12, ' '));
        int i = 1;
        for (Car car : carRentals.getCars()) {
            if (!car.isRented()) {
                System.out.println(i + "." + StringUtils.center(car.getMake(), 14, " ") + StringUtils.center(car.getModel(), 16, " ") + StringUtils.center(car.getFuelType(), 14, " ")
                        + StringUtils.center(car.getGearbox(), 14, " ") + StringUtils.center(String.valueOf(car.getNoOfDoors()), 10, ' ') + StringUtils.center(String.valueOf(car.getNoOfSeats()), 10, ' ')
                        + StringUtils.center(String.valueOf(car.getPricePerDay()), 12, ' ') + StringUtils.center(car.getCarType(), 20, " "));
            } else {
                continue;
            }
            i++;
        }
    }

    @Override
    public void sortByGearbox(RentalShop carRentals) {
        carRentals.cars.sort((o1, o2) -> o1.getGearbox().compareTo(o2.getGearbox()));
        System.out.println(StringUtils.center("  Make", 16, " ") + StringUtils.center("  Model", 16, " ") + StringUtils.center("Fuel type", 16, ' ')
                + StringUtils.center("Transmission", 12, ' ') + StringUtils.center("Doors", 12, ' ') + StringUtils.center("Seats", 8, ' ') + StringUtils.center("Price per day", 16, ' ') + StringUtils.center("Car Size", 12, ' '));
        int i = 1;
        for (Car car : carRentals.getCars()) {
            if (!car.isRented()) {
                System.out.println(i + "." + StringUtils.center(car.getMake(), 14, " ") + StringUtils.center(car.getModel(), 16, " ") + StringUtils.center(car.getFuelType(), 14, " ")
                        + StringUtils.center(car.getGearbox(), 14, " ") + StringUtils.center(String.valueOf(car.getNoOfDoors()), 10, ' ') + StringUtils.center(String.valueOf(car.getNoOfSeats()), 10, ' ')
                        + StringUtils.center(String.valueOf(car.getPricePerDay()), 12, ' ') + StringUtils.center(car.getCarType(), 20, " "));
            } else {
                continue;
            }
            i++;
        }
    }

    @Override
    public void sortByCategory(RentalShop carRentals) {
        carRentals.cars.sort((o1, o2) -> o1.getCarType().compareTo(o2.getCarType()));
        System.out.println(StringUtils.center("  Make", 16, " ") + StringUtils.center("  Model", 16, " ") + StringUtils.center("Fuel type", 16, ' ')
                + StringUtils.center("Transmission", 12, ' ') + StringUtils.center("Doors", 12, ' ') + StringUtils.center("Seats", 8, ' ') + StringUtils.center("Price per day", 16, ' ') + StringUtils.center("Car Size", 12, ' '));
        int i = 1;
        for (Car car : carRentals.getCars()) {
            if (!car.isRented()) {
                System.out.println(i + "." + StringUtils.center(car.getMake(), 14, " ") + StringUtils.center(car.getModel(), 16, " ") + StringUtils.center(car.getFuelType(), 14, " ")
                        + StringUtils.center(car.getGearbox(), 14, " ") + StringUtils.center(String.valueOf(car.getNoOfDoors()), 10, ' ') + StringUtils.center(String.valueOf(car.getNoOfSeats()), 10, ' ')
                        + StringUtils.center(String.valueOf(car.getPricePerDay()), 12, ' ') + StringUtils.center(car.getCarType(), 20, " "));
            } else {
                continue;
            }
            i++;
        }
    }

    @Override
    public void sortByPrice(RentalShop carRentals) {
//        carRentals.cars.sort(( o1, o2 ) -> o1.getPricePerDay().compareTo(o2.getPricePerDay()));
        System.out.println(StringUtils.center("  Make", 16, " ") + StringUtils.center("  Model", 16, " ") + StringUtils.center("Fuel type", 16, ' ')
                + StringUtils.center("Transmission", 12, ' ') + StringUtils.center("Doors", 12, ' ') + StringUtils.center("Seats", 8, ' ') + StringUtils.center("Price per day", 16, ' ') + StringUtils.center("Car Size", 12, ' '));
        int i = 1;
        for (Car car : carRentals.getCars()) {
            if (!car.isRented()) {
                System.out.println(i + "." + StringUtils.center(car.getMake(), 14, " ") + StringUtils.center(car.getModel(), 16, " ") + StringUtils.center(car.getFuelType(), 14, " ")
                        + StringUtils.center(car.getGearbox(), 14, " ") + StringUtils.center(String.valueOf(car.getNoOfDoors()), 10, ' ') + StringUtils.center(String.valueOf(car.getNoOfSeats()), 10, ' ')
                        + StringUtils.center(String.valueOf(car.getPricePerDay()), 12, ' ') + StringUtils.center(car.getCarType(), 20, " "));
            } else {
                continue;
            }
            i++;
        }
    }

}
