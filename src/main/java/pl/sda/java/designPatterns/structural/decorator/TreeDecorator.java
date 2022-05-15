package pl.sda.java.designPatterns.structural.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class TreeDecorator implements ChristmasTree {

    protected ChristmasTree tree;

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
