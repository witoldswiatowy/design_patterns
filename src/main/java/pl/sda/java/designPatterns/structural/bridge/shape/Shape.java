package pl.sda.java.designPatterns.structural.bridge.shape;

import lombok.AllArgsConstructor;
import pl.sda.java.designPatterns.structural.bridge.color.Color;

@AllArgsConstructor
public abstract class Shape {

    protected Color color;

    abstract public String draw();
}