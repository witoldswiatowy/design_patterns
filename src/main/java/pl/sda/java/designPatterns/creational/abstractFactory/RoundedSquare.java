package pl.sda.java.designPatterns.creational.abstractFactory;

public class RoundedSquare implements Shape {

    public static final String DRAW_MSG = "rysuję zaokrąglony kwadrat";

    @Override
    public String draw() {
        return DRAW_MSG;
    }
}
