package com.codurance.shopping_basket_kata.test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class ShoppingBasketServiceShould {

    @Test
    void
    add_an_item() {
        User user = Mockito.mock(User.class);
        UserID userID = new UserID("user1");
        UserRepository userRepository = Mockito.mock(UserRepository.class);
        when(userRepository.retrieve(userID)).thenReturn(user);

        ProductID productId = new ProductID("The Hobbit");
        int quantity = 2;
        verify(user).addProductsToTheBasket(productId, quantity);
        verify(userRepository).update(user);
    }

}