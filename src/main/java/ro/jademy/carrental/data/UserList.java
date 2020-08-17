package ro.jademy.carrental.data;

import ro.jademy.carrental.models.users.Client;
import ro.jademy.carrental.models.users.Salesman;
import ro.jademy.carrental.models.users.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserList {

    User user1 = new Salesman("Popescu", "Popescu", "ppopescu", "1234");
    User user2 = new Salesman("Gigescu", "Gigi", "ggigescu", "5678");
    User user3 = new Client("Vladescu", "Vlad", "vvladescu", "vlad", LocalDate.of(2018, 10, 1));
    User user4 = new Client("Marculescu", "Marcu", "mmarculescu", "vlad", LocalDate.of(2020, 1, 2));
    User user5 = new Client("Andreescu", "Andrei", "aandreescu", "vlad", LocalDate.of(2017, 9, 15));
    User user6 = new Client("Ionescu", "Ion", "iionescu", "vlad", LocalDate.of(2010, 2, 28));


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
