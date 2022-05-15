package pl.sda.java.designPatterns.creational.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@AllArgsConstructor
public class UserLombok {
    private String firstName; // required
    private String lastName; // required

    @Setter
    private String phone;
    private String address;
    private int age;
}
