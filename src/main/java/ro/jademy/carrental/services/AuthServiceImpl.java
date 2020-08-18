package ro.jademy.carrental.services;

import ro.jademy.carrental.models.users.Client;
import ro.jademy.carrental.models.users.Salesman;
import ro.jademy.carrental.models.users.User;

import java.util.List;

public class AuthServiceImpl implements AuthService {
    @Override
    public User doLogin(List<User> users, String userName, String userPassword) {
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                if (user.getUserPassword().equals(userPassword)) {
                    return user;
                }
            }
        }
        return null;
    }

    @Override
    public Client logOutClient(Client client) {
        return null;
    }

    @Override
    public Salesman logOutSalesman(Salesman salesman) {
        return null;
    }

    @Override
    public boolean doExitApp() {
        return true;
    }
}
