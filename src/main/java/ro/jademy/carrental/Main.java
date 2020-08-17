package ro.jademy.carrental;


import ro.jademy.carrental.models.RentalShop;

public class Main {
    public static void main(String[] args) {

        ro.jademy.carrental.data.CarList carList = new ro.jademy.carrental.data.CarList();
        ro.jademy.carrental.data.UserList userList = new ro.jademy.carrental.data.UserList();
        RentalShop rentalShop = new RentalShop(userList.getUserList(), carList.getCarList());

        rentalShop.rentalShop();

    }
}
