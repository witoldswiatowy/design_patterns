package pl.sda.java.designPatterns.structural.bridge;

import org.junit.jupiter.api.Test;
import pl.sda.java.designPatterns.structural.bridge.color.Blue;
import pl.sda.java.designPatterns.structural.bridge.color.Red;
import pl.sda.java.designPatterns.structural.bridge.shape.Circle;
import pl.sda.java.designPatterns.structural.bridge.shape.Shape;
import pl.sda.java.designPatterns.structural.bridge.shape.Square;

import static org.junit.jupiter.api.Assertions.*;

class BridgeTest {

    @Test
    void shouldDrawRedCircle() {
        Shape circle = new Circle(new Red());

        String drawCircle = circle.draw();

        assertEquals("red circle", drawCircle);
    }

    @Test
    void shouldDrawBlueSquare() {
        Shape square = new Square(new Blue());

        String drawSquare = square.draw();

        assertEquals("blue square", drawSquare);
    }
}