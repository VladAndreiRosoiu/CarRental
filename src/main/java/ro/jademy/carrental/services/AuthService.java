package ro.jademy.carrental.services;

import ro.jademy.carrental.models.users.User;

import java.util.List;

public interface AuthService {

    User doLogin(List<User> users, String userName, String userPassword);


}
