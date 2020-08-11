package ro.jademy.carrental;


public class Main {
    public static void main(String[] args) {

        ro.jademy.carrental.data.CarList carList=new ro.jademy.carrental.data.CarList();
        ro.jademy.carrental.data.UserList userList=new ro.jademy.carrental.data.UserList();
        RentalShop rentalShop =new RentalShop(userList.getUserList(), carList.getCarList());
        rentalShop.rentalShop();

    }


    //TODO:
    // add admin logic - admin can add/remove cars
    //                     - admin can add/remove users
    //                     - admin can see rented cars and income produced
    // add client logic - client can borrow car(add validation for driving licence issue date)
    //                      - client will have to pay for rented car + add guarantee a deposit before renting car.
    //                      - client can return car. After rent the deposit must be returned to client if car has not been damaged

}
