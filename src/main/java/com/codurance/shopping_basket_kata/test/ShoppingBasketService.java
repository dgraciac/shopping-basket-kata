package com.codurance.shopping_basket_kata.test;

public class ShoppingBasketService {
    private final UserRepository userRepository;

    public ShoppingBasketService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addItem(UserID userId, ProductID productId, int quantity) {
        User user = userRepository.retrieve(userId);

        user.addProductsToTheBasket(productId, quantity);

        userRepository.update(user);
    }

    public String basketFor(UserID userId) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
