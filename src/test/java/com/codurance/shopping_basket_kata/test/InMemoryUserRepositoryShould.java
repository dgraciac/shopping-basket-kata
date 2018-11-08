package com.codurance.shopping_basket_kata.test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InMemoryUserRepositoryShould {

    @Test
    void
    create_non_existing_user() {
        InMemoryUserRepository inMemoryUserRepository = new InMemoryUserRepository();

        UserID userID = new UserID("USER1");
        inMemoryUserRepository.retrieve(userID);

        assertThat(inMemoryUserRepository.exists(userID)).isTrue();
    }

    @Test void
    retrieve_existing_user() {
        InMemoryUserRepository inMemoryUserRepository = new InMemoryUserRepository();
        String user1IDPrimitive = "user1";
        UserID userID = new UserID(user1IDPrimitive);
        User createdUser = inMemoryUserRepository.retrieve(userID);

        User retrievedUser = inMemoryUserRepository.retrieve(userID);

        assertThat(retrievedUser).isEqualTo(createdUser);
    }

}