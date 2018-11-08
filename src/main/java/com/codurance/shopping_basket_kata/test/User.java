package com.codurance.shopping_basket_kata.test;

public class User {
    public void addProductsToTheBasket(ProductID productId, int quantity) {
        // Option A: User internally owns the basket
        //Option B: external collaborator owns the basket
        //maybe if we go B. User class will be dummy. A passing ball only class. No
        //if we move the reposibility of storing products to other collabora...  User do nothing. User class is useless
        //we can have an internal data structure to store products in this class
        //Main point is if a class only delegates but do nothing apart that, we can remove this class
        throw new UnsupportedOperationException("Not implemented");
    }
}
