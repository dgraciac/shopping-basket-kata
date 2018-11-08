package com.codurance.shopping_basket_kata.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InMemoryUserRepositoryShould {

    private InMemoryUserRepository inMemoryUserRepository;
    private UserID userID;

    @BeforeEach
    void setUp() {
        inMemoryUserRepository = new InMemoryUserRepository();
        userID = new UserID("user1");
    }

    @Test
    void
    create_non_existing_user() {
        assertThat(inMemoryUserRepository.exists(userID)).isFalse();

        inMemoryUserRepository.retrieve(userID);

        assertThat(inMemoryUserRepository.exists(userID)).isTrue();
    }

    @Test void
    retrieve_existing_user() {
        User createdUser = inMemoryUserRepository.retrieve(userID);

        User retrievedUser = inMemoryUserRepository.retrieve(userID);

        assertThat(retrievedUser).isEqualTo(createdUser);
    }
}