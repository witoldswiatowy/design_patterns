package pl.sda.java.designPatterns.creational.abstractFactory;

public interface AbstractFactory {
    Shape getShape(ShapeType shapeType);
}
