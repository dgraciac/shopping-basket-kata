package com.codurance.shopping_basket_kata.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InMemoryUserRepositoryShould {

    @Test
    void
    create_non_existing_user() {
        InMemoryUserRepository inMemoryUserRepository = new InMemoryUserRepository();

        UserID userID = new UserID("USER1");
        inMemoryUserRepository.retrieve(userID);

        assertThat(inMemoryUserRepository.exists(userID)).isTrue();
    }

}