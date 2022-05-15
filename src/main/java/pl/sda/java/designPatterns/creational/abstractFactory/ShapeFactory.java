package pl.sda.java.designPatterns.creational.abstractFactory;

public class ShapeFactory implements AbstractFactory{

    @Override
    public Shape getShape(ShapeType shapeType) {

        Shape shape = switch (shapeType) {
            case RECTANGLE -> new Rectangle();
            case SQUARE -> new Square();
            default -> null;
        };

        return shape;
    }

}
