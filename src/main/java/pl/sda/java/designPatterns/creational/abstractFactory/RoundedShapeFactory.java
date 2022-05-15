package pl.sda.java.designPatterns.creational.abstractFactory;

public class RoundedShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(ShapeType shapeType) {

        Shape shape = switch (shapeType) {
            case RECTANGLE -> new RoundedRectangle();
            case SQUARE -> new RoundedSquare();
            default -> null;
        };

        return shape;
    }
}