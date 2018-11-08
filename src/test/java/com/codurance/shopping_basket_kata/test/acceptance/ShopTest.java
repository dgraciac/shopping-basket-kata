package com.codurance.shopping_basket_kata.test.acceptance;

import com.codurance.shopping_basket_kata.test.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class ShopTest {

    @Test
    void
    acceptanceTest() {
        Date date = Mockito.mock(Date.class);
        when(date.now()).thenReturn("05/09/2020");

        UserID userId = new UserID("user1");
        UserRepository userRepository = new InMemoryUserRepository();
        ShoppingBasketService shoppingBasketService = new ShoppingBasketService(userRepository);
        shoppingBasketService.addItem(userId, new ProductID("The Hobbit"), 2);
        shoppingBasketService.addItem(userId, new ProductID("Breaking Bad"), 5);
        String actualShoppingBasket = shoppingBasketService.basketFor(userId);

        String expectedShoppingBasket = "\n" +
                "Creation date: 05/09/2020\n" +
                "2 x The Hobbit\n" +
                "5 x Breaking Bad\n" +
                "Total: £45.00\n";
        assertThat(actualShoppingBasket).isEqualTo(expectedShoppingBasket);
    }
}
