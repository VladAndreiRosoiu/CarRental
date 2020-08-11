package ro.jademy.carrental;


public class Main {
    public static void main(String[] args) {

        ro.jademy.carrental.data.CarList carList=new ro.jademy.carrental.data.CarList();
        ro.jademy.carrental.data.UserList userList=new ro.jademy.carrental.data.UserList();
        RentalShop rentalShop =new RentalShop(userList.getUserList(), carList.getCarList());
        rentalShop.rentalShop();

    }


    //TODO:
    // add a attribute on the client List<Car> rentedHistory to hold rental history of that client. Implement renting discount based on this list
    // for 3 rented cars, 10 % discount, for 6 rented cars 15 % discount, for more than 12 rented cars do 20 % discount
    //implement rent validation on driving licence issue date
    //ex: if issue date is less than a year, client can't rent. if more than a year, client may rent a cat 1 and 2 car, for more than 2, other categories


}
