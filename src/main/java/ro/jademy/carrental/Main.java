package ro.jademy.carrental;


import ro.jademy.carrental.data.CarList;
import ro.jademy.carrental.data.UserList;
import ro.jademy.carrental.models.RentalShop;

public class Main {
    public static void main(String[] args) {

        RentalShop rentalShop = new RentalShop(UserList.getUserList(), CarList.getCarList());

        rentalShop.rentalShop();

    }
}
