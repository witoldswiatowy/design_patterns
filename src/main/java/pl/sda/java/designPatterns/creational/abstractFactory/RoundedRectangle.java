package pl.sda.java.designPatterns.creational.abstractFactory;

public class RoundedRectangle implements Shape {

    public static final String DRAW_MSG = "rysuję zaokrąglony prostokąt";


    @Override
    public String draw() {
        return DRAW_MSG;
    }
}
