package ro.jademy.carrental;

import ro.jademy.carrental.data.RentalList;
import ro.jademy.carrental.models.RentedCar;
import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.models.users.Client;
import ro.jademy.carrental.models.users.Salesman;
import ro.jademy.carrental.models.users.User;
import ro.jademy.carrental.services.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentalShop {

    private static final Scanner sc = new Scanner(System.in);
    private List<User> listOfUsers;
    private List<Car> listOfCars;
    RentalList rentalList= new RentalList();
    List<RentedCar> rentedCars = new ArrayList<>(rentalList.getRentalList());


    private AuthService authService = new AuthServiceImpl();
    private SearchService searchService = new SearchServiceImpl();
    private RentService rentService = new RentServiceImpl();

    private Salesman loggedInSalesman;
    private Client loggedInClient;


    public RentalShop(List<User> userList, List<Car> carList) {
        this.listOfUsers = userList;
        this.listOfCars = carList;
    }

    public void rentalShop() {

        int menuChoice;
        String keyword;
        boolean exitApp;

        do {
            exitApp = false;
            showWelcome();
            System.out.println("Please enter username:");
            String userName = sc.next();
            System.out.println("Please enter password:");
            String userPassword = sc.next();
            setCurrentUser(userName, userPassword);

            do {
                if (loggedInSalesman != null) {
                    showSalesmanMenu();
                    System.out.println("Please enter choice:");
                    menuChoice = sc.nextInt();
                    switch (menuChoice) {
                        case 1:
                            //print all cars
                            showAllCars();
                            break;
                        case 2:
                            //show currently rented cars
                            showRentedCars();
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
                            //log out
                            loggedInSalesman=authService.logOutSalesmant(loggedInSalesman);
                            break;
                        case 8:
                            loggedInSalesman=authService.logOutSalesmant(loggedInSalesman);
                            exitApp=authService.doExitApp();
                            break;
                        default:
                            printError();
                            break;
                    }
                }
                if (loggedInClient != null) {
                    showClientMenu();
                    System.out.println("Please enter choice:");
                    menuChoice = sc.nextInt();
                    switch (menuChoice) {
                        case 1:
                            showAllCars();
                            break;
                        case 2:
                            showFilterMenuOptions();
                            System.out.println("Please enter your choice:");
                            menuChoice = sc.nextInt();
                            if (menuChoice == 3) {
                                System.out.println("Please enter lowest price:");
                                int lowestPrice = sc.nextInt();
                                System.out.println("Please enter highest price:");
                                int highestPrice = sc.nextInt();
                                doFilterByBudget(lowestPrice, highestPrice);
                            } else {
                                System.out.println("Please enter search criteria:");
                                keyword = sc.next().toLowerCase();
                                doFilter(menuChoice, keyword);
                            }
                            break;
                        case 3:
                            //rent car
                            System.out.println("Please enter UUID of the car you want to rent:");
                            String uuid = sc.next();
                            Car tempCar = searchService.searchCarByUUID(listOfCars, uuid);
                            if (rentService.validateDriverLicence(loggedInClient, tempCar)) {
                                System.out.println("Driving licence conditions met!");
                                showDepositInformation(tempCar);
                                int deposit = sc.nextInt();
                                if (doDepositForRent(deposit)) {
                                    System.out.println("You have deposited " + deposit + "!");
                                } else {
                                    System.out.println("You cannot deposit " + deposit + "!");
                                }

                                if (rentService.validateDepositForRent(loggedInClient, tempCar)) {
                                    System.out.println("Conditions met!");
                                    System.out.println("Please enter number of days for rental : ");
                                    int nrOfDays = sc.nextInt();
                                    int finalPrice = rentService.calculateFinalRentPrice(tempCar, nrOfDays);
                                    System.out.println("For your rent you will have to pay " + finalPrice + ".");
                                    rentService.rentCar(listOfCars, loggedInClient, tempCar);
                                    System.out.println("Car successfully rented!");
                                    rentedCars.add(rentService.rentedCar(tempCar, loggedInClient, finalPrice));
                                }
                            }
                            break;
                        case 4:
                            showRentedCar();
                            break;
                        case 5:
                            //return rented car
                            RentedCar tempRentedCar = new RentedCar();
                            for (RentedCar rentedCar : rentedCars) {
                                if (rentedCar.getRentedCar().equals(loggedInClient.getCurrentlyRentedCar()) && rentedCar.getClient().equals(loggedInClient)) {
                                    tempRentedCar = rentedCar;
                                }
                            }
                            System.out.println("To return the rented car, first you will have to pay : " + tempRentedCar.getRentPriceAfterDiscount());
                            int payed = sc.nextInt();
                            if (rentService.validatePayedAmount(payed, rentedCars, loggedInClient)) {
                                rentService.returnRentedCar(listOfCars, rentedCars, loggedInClient);
                                System.out.println("Car successfully returned!");
                                System.out.println("Deposit refunded!");
                                System.out.println(loggedInClient.getDeposit());
                            }

                            break;
                        case 6:
                            //log out
                            loggedInClient = authService.logOutClient(loggedInClient);
                            System.out.println("Logged out!");
                            break;
                        case 7:
                            //exit app
                            loggedInClient = authService.logOutClient(loggedInClient);
                            exitApp = authService.doExitApp();
                            System.out.println("Exited application!");
                            break;
                        default:
                            printError();
                            break;
                    }
                }
            } while (loggedInClient != null || loggedInSalesman != null);
        } while (!exitApp);

    }

    //_____________________________________General use related methods__________________________________________________

    private void showFilterMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");

    }

    private void printError() {
        System.out.println("Unknown choice!");
    }

    private void doFilter(int choice, String keyword) {
        switch (choice) {
            case 1:
                printFiltered(searchService.searchCarByMake(listOfCars, keyword));
                break;
            case 2:
                printFiltered(searchService.searchCarByModel(listOfCars, keyword));
                break;
            case 4:
                break;
            default:
                printError();
                break;
        }
    }

    private void doFilterByBudget(int lowestPrice, int highestPrice) {
        printFiltered(searchService.searchCarByPriceRange(listOfCars, lowestPrice, highestPrice));
    }

    void printFiltered(List<Car> carList) {
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    private void showWelcome() {
        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Car Rental Shop   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
    }

    private void setCurrentUser(String userName, String userPassword) {
        if (authService.doLogin(listOfUsers, userName, userPassword) instanceof Salesman) {
            loggedInSalesman = (Salesman) authService.doLogin(listOfUsers, userName, userPassword);
        } else if (authService.doLogin(listOfUsers, userName, userPassword) instanceof Client) {
            loggedInClient = (Client) authService.doLogin(listOfUsers, userName, userPassword);
        }
    }

    private void showAllCars() {

        // displays all the cars that the rental shop has (including unavailable cars)

        for (Car car : listOfCars) {
            System.out.println(car);
        }
    }

    //____________________________________________Client related methods________________________________________________

    private void showDepositInformation(Car car) {
        System.out.println("To rent a car, you need to make a deposit first!");
        System.out.println("Your deposit will be refunded when you return the car! ");
        if (car.getRentCategory() == 1) {
            System.out.println("For a category one car you need to deposit at least 100.");
        } else if (car.getRentCategory() == 2) {
            System.out.println("For a category two car you need to deposit at least 200.");
        } else if (car.getRentCategory() == 3) {
            System.out.println("For a category three car you need to deposit at least 300.");
        } else {
            System.out.println("For a category four car you need to deposit at least 400.");
        }
    }

    private void showClientMenu() {
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. Filter car list by:");
        System.out.println("3. Rent car");
        System.out.println("4. Show rented car");
        System.out.println("5. Return rented car");
        System.out.println("6. Logout");
        System.out.println("7. Exit");
    }

    private boolean doDepositForRent(int deposit) {
        if (deposit != 0) {
            loggedInClient.setDeposit(deposit);
            return true;
        }
        return false;
    }

    private void showRentedCar() {
        //
        if (loggedInClient.getCurrentlyRentedCar() != null) {
            System.out.println(loggedInClient.getCurrentlyRentedCar());
        } else {
            System.out.println("You have no cars currently rented!");
        }
    }


    //__________________________________________Salesman related methods_______________________________________________

    private void showSalesmanMenu() {
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List currently rented cars");
        System.out.println("3. Current income");
        System.out.println("4. Highest income generated by client");
        System.out.println("5. Most rented car");
        System.out.println("6. User with most rentals");
        System.out.println("7. Logout");
        System.out.println("8. Exit");
    }

    private void showRentedCars() {

        //displays cars that are rented
        //must display also by who the car is rented, and the period
        for (RentedCar rentedCar : rentedCars) {
            System.out.println(rentedCar.getRentedCar());
            System.out.println("Rented by : " + rentedCar.getClient().getFullName());
            System.out.println("Car rented for " + "days.");
        }

    }

}


