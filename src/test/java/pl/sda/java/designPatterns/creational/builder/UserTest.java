package pl.sda.java.designPatterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void shouldCreateUserOnlyWithFirstNameAndLastName() {
        String firstName = "Królewena";
        String lastName = "Śnieżka";

        User user = new User.UserBuilder(firstName, lastName)
                .build();

        assertEquals(firstName, user.getFirstName());
        assertEquals(lastName, user.getLastName());
        assertEquals(0, user.getAge());
        assertEquals(null, user.getAddress());
        assertEquals(null, user.getPhone());
    }

    @Test
    void shouldCreateUserWithAllProperties() {
        String firstName = "Królewena";
        String lastName = "Śnieżka";
        String address = "klonowa 4";
        int age = 4;
        String phone = "444 664 322";

        User user = new User.UserBuilder(firstName, lastName)
                .address(address)
                .age(age)
                .phone(phone)
                .build();

        assertEquals(firstName, user.getFirstName());
        assertEquals(lastName, user.getLastName());
        assertEquals(age, user.getAge());
        assertEquals(address, user.getAddress());
        assertEquals(phone, user.getPhone());
    }
}