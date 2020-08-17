package ro.jademy.carrental.services;

import ro.jademy.carrental.models.users.Client;
import ro.jademy.carrental.models.users.Salesman;
import ro.jademy.carrental.models.users.User;

import java.util.List;

public interface AuthService {

    User doLogin(List<User> users, String userName, String userPassword);

    Client logOutClient(Client client);

    Salesman logOutSalesmant(Salesman salesman);

    boolean doExitApp();
}
