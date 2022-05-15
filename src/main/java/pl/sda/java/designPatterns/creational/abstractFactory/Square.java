package pl.sda.java.designPatterns.creational.abstractFactory;

public class Square implements Shape {
    public static final String DRAW_MSG = "rysuję kwadrat";

    @Override
    public String draw() {
        return DRAW_MSG;
    }
}
