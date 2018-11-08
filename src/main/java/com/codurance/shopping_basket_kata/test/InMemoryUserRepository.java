package com.codurance.shopping_basket_kata.test;

import java.util.Hashtable;
import java.util.Map;

public class InMemoryUserRepository implements UserRepository {

    private Map<UserID, User> userDatabase;

    public InMemoryUserRepository() {
        userDatabase = new Hashtable<>();
    }

    @Override
    public User retrieve(UserID userID) {
        User user = new User();
        userDatabase.put(userID,user);
        return user;
    }

    @Override
    public void update(User user) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean exists(UserID userID) {
        return true;
    }
}
