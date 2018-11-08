package com.codurance.shopping_basket_kata.test;

public interface UserRepository {
    User retrieve(UserID userID);

    void update(User user);
}
