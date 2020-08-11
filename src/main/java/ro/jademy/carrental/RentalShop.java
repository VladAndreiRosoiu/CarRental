package ro.jademy.carrental;

import ro.jademy.carrental.users.Salesman;
import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.users.Client;
import ro.jademy.carrental.users.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentalShop {

    private static final Scanner sc = new Scanner(System.in);
    private List<User> listOfUsers;
    private List<Car> listOfCars;
    //private List<Car> availableCarList = new ArrayList<>();
    private List<Car> rentedCarList = new ArrayList<>();
    private Salesman loggedInSalesman;
    private Client loggedInClient;

    public RentalShop(List<User> userList, List<Car> carList) {
        this.listOfUsers = userList;
        this.listOfCars = carList;
    }

    public void rentalShop() {

        int menuChoice;
        boolean isLoggedIn = false;
        String keyword;
        //showAllAvailableCars();

        showWelcome();
        System.out.println("Please enter username:");
        String userName = sc.next();
        System.out.println("Please enter password:");
        String userPassword = sc.next();
        doLogin(userName, userPassword);

        do {
            if (loggedInSalesman != null) {
                isLoggedIn = true;
                showSalesmanMenu();
                System.out.println("Please enter choice:");
                menuChoice = sc.nextInt();
                switch (menuChoice) {
                    case 1:
                        System.out.println(1);
                        break;
                    case 2:
                        System.out.println(2);
                        break;
                    case 3:
                        System.out.println(3);
                        break;
                    case 4:
                        System.out.println(4);
                        break;
                    case 5:
                        System.out.println(5);
                        break;
                    case 6:
                        System.out.println(6);
                        break;
                    case 7:
                        System.out.println(7);
                        break;
                    case 8:
                        System.out.println(8);
                        break;
                    case 9:
                        System.out.println(9);
                        break;
                    default:
                        System.out.println("default");
                        break;
                }
            }
            if (loggedInClient != null) {
                isLoggedIn = true;
                showClientMenu();
                System.out.println("Please enter choice:");
                menuChoice = sc.nextInt();
                switch (menuChoice) {
                    case 1:
                        showAllCars();
                        break;
                    case 2:
                        //showAllAvailableCars();
                        break;
                    case 3:
                        System.out.println(3);
                        showFilterMenuOptions();
                        menuChoice = sc.nextInt();
                        filterCars(menuChoice);
                        break;
                    case 4:
                        System.out.println("Please enter UUID:");
                        keyword = sc.next();
                        System.out.println("Please enter how many days you want to rent the car:");
                        int nrOfDays = sc.nextInt();
                        rentCar(carByUUID(keyword), nrOfDays);
                        break;
                    case 5:
                        showRentedCar();
                        break;
                    case 6:
                        doLogOut();
                        break;
                    default:
                        System.out.println("default");
                        break;
                }
            }
        } while (isLoggedIn);

    }

    private void doLogin(String userName, String userPassword) {
        if (validateLogIn(userName, userPassword) instanceof Salesman) {
            loggedInSalesman = (Salesman) validateLogIn(userName, userPassword);
        } else if (validateLogIn(userName, userPassword) instanceof Client) {
            loggedInClient = (Client) validateLogIn(userName, userPassword);
        }
    }

    private User validateLogIn(String userName, String userPassword) {
        for (User user : listOfUsers) {
            if (user.getUserName().equals(userName)) {
                if (user.getUserPassword().equals(userPassword)) {
                    return user;
                }
            }
        }
        return null;
    }

    private void showWelcome() {
        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Car Rental Shop   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
    }

    private void showSalesmanMenu() {
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. List all users");
        System.out.println("6. Add user");
        System.out.println("7. Add / remove car");
        System.out.println("8. Logout");
        System.out.println("9. Exit");
    }

    private void showClientMenu() {
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List all available cars");
        System.out.println("3. Filter car list by:");
        System.out.println("4. Rent car");
        System.out.println("5. Show rented car");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
    }

    private void showFilterMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");

    }

    private void showAllCars() {

        // displays all the cars that the rental shop has (including unavailable cars)

        for (Car car : listOfCars) {
            System.out.println(car);
        }
    }

//    private void showAllAvailableCars() {
//
//        for (Car car : listOfCars) {
//            if (!car.isCarRented()) {
//                availableCarList.add(car);
//                System.out.println(car);
//            }
//        }
//    }

    private void showRentedCars() {

        //displays cars that are rented
        //must display also by who the car is rented, and the period

    }

    private void checkIncome() {

        //calculates current income from rented cars at the moment

    }

    private void showAllClients() {

        //displays the list of clients
        //displays the history of a specific client

    }

    private void addNewClient() {

        //this method allows the salesman to add new client
    }

    private void addNewCar() {

        //this method allows the salesman to add a new car
    }

    private void removeCar() {

        //this method allows the salesman to remove a car from the list
    }

    private void doLogOut() {

        //logs out the current user

    }

    private void existShop() {

        //exist app

    }

    private void filterCars(int option) {

        String keyword;
        int lowestPrice, highestPrice;

        switch (option) {
            case 1:
                System.out.println("Please enter desired make:");
                keyword = sc.next();
                System.out.println(filterCarsByMake(keyword));
                break;
            case 2:
                System.out.println("Please enter desired model:");
                keyword = sc.next();
                System.out.println(filterCarsByModel(keyword));
            case 3:
                System.out.println("Please enter lowest price:");
                lowestPrice = sc.nextInt();
                System.out.println("Please enter highest price:");
                highestPrice = sc.nextInt();
                System.out.println(filterCarsByBudget(lowestPrice, highestPrice));
                break;
            default:
                System.out.println("Option not found!");
                break;
        }
    }

    private Car filterCarsByMake(String keyword) {
        for (Car car : listOfCars) {
            if (car.getMake().equals(keyword)) {
                return car;
            }
        }
        return null;
    }

    private Car filterCarsByModel(String keyword) {
        for (Car car : listOfCars) {
            if (car.getModel().equals(keyword)) {
                return car;
            }
        }
        return null;
    }

    private Car filterCarsByBudget(int lowestPrice, int highestPrice) {
        for (Car car : listOfCars) {
            if (car.getRentPricePerDay() >= lowestPrice && car.getRentPricePerDay() <= highestPrice) {
                return car;
            }
        }
        return null;
    }

    public Car carByUUID(String uuid) {
        for (Car car : listOfCars) {
            if (car.getUUID().equals(uuid)) {
                return car;
            }
        }
        return null;
    }

    private void depositForRent() {
        int deposit;
        System.out.println("To rent a car, you need to make a deposit first.");
        System.out.println("For a category one car you need to deposit at least 100.");
        System.out.println("For a category two car you need to deposit at least 200.");
        System.out.println("For a category three car you need to deposit at least 300.");
        System.out.println("For a category four car you need to deposit at least 400.");
        System.out.println("Please deposit the correct amount for rented car.");
        deposit = sc.nextInt();
        if (deposit != 0) {
            loggedInClient.setDeposit(deposit);
        } else {
            System.out.println("You cannot make a deposit of 0.");
        }
    }


    private boolean validateRent(Car car) {
        depositForRent();
        if (car.getRentCategory() == 1 && loggedInClient.getDeposit() >= 100) {
            return true;
        } else if (car.getRentCategory() == 2 && loggedInClient.getDeposit() >= 200) {
            return true;
        } else if (car.getRentCategory() == 3 && loggedInClient.getDeposit() >= 300) {
            return true;
        } else return car.getRentCategory() == 4 && loggedInClient.getDeposit() >= 400;
    }


    private void rentCar(Car car, int nrOfDays) {
        int hasToPay;
        if (validateRent(car)) {
            System.out.println("Successfully rented " + car);
            loggedInClient.setRentedCar(car);
            listOfCars.remove(car);
            rentedCarList.add(car);
            if (nrOfDays > 10) {
                hasToPay = nrOfDays * car.getRentPricePerDay();
                System.out.println("Because you want to rent the car for more than 10 days, you get a discount of 15%!");
                System.out.println("The total will be : " + hasToPay);
            } else {
                hasToPay = nrOfDays * car.getRentPricePerDay();
                System.out.println("The total will be : " + hasToPay);
            }
        }
    }

    private void showRentedCar() {
        System.out.println(loggedInClient.getRentedCar());
    }

    private void returnRentedCar() {
    }

    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }
}

