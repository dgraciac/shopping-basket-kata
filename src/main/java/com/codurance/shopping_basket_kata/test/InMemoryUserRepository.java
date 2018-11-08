package com.codurance.shopping_basket_kata.test;

public class InMemoryUserRepository implements UserRepository {
    @Override
    public User retrieve(UserID userID) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void update(User user) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean exists(UserID userID) {
        return false;
    }
}
