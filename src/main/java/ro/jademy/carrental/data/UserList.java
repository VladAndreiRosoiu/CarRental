package ro.jademy.carrental.data;

import ro.jademy.carrental.users.Salesman;
import ro.jademy.carrental.users.Client;
import ro.jademy.carrental.users.User;

import java.util.ArrayList;
import java.util.List;

public class UserList {

    User user1 = new Salesman("Popescu", "Popescu", "ppopescu", "1234");
    User user2 = new Salesman("Gigescu", "Gigi", "ggigescu", "5678");
    User user3 = new Client("Vladescu", "Vlad", "vvladescu", "vlad", "11-01-2019");
    User user4 = new Client("Marculescu", "Marcu", "mmarculescu", "vlad", "11-01-2019");
    User user5 = new Client("Andreescu", "Andrei", "aandreescu", "vlad", "11-01-2019");
    User user6 = new Client("Ionescu", "Ion", "iionescu", "vlad", "11-01-2019");


    public List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        return userList;
    }
}
