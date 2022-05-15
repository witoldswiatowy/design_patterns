package pl.sda.java.designPatterns.creational.abstractFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {
    @Test
    void shouldCreateRoundedSquare() {
        AbstractFactory factory = FactoryProducer.getFactory(true);

        Shape roundedSquare = factory.getShape(ShapeType.SQUARE);

        String draw = roundedSquare.draw();
        assertEquals(RoundedSquare.DRAW_MSG, draw);
    }

    @Test
    void shouldCreateSquare() {
        AbstractFactory factory = FactoryProducer.getFactory(false);

        Shape square = factory.getShape(ShapeType.SQUARE);

        String draw = square.draw();
        assertEquals(Square.DRAW_MSG, draw);
    }
}