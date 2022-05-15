package pl.sda.java.designPatterns.creational.builder;

import org.junit.jupiter.api.Test;

class UserLombokTest {

    @Test
    void lombokUsage() {
        UserLombok user = UserLombok.builder()
                .firstName("Królewna")
                .age(5)
                .lastName("śnieżka")
                .address("klonowa")
                .phone("53345 53464 35")
                .build();

        user.getAddress();
//        user.setAddress("kdjfs");
    }
}