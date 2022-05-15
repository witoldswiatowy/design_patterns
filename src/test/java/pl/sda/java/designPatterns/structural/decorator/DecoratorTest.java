package pl.sda.java.designPatterns.structural.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoratorTest {

    @Test
    void shouldBeDecoratedWithGarland() {
        ChristmasTreeImpl nakedTree = new ChristmasTreeImpl();
        ChristmasTree christmasTreeWithGarland = new Garland(nakedTree);

        String decorate = christmasTreeWithGarland.decorate();

        assertEquals("Christmas tree with garland", decorate);
    }

    @Test
    void ShouldBeDecoratedWithGarlandAndBubbleLights() {
//        ChristmasTreeImpl nakedTree = new ChristmasTreeImpl();
//        ChristmasTree christmasTreeWithGarland = new Garland(nakedTree);
//        ChristmasTree treeWithGarlandAndBubbleLights = new BubbleLights(christmasTreeWithGarland);

        ChristmasTree treeWithGarlandAndBubbleLights = new BubbleLights(new Garland(new ChristmasTreeImpl()));

        String decorate = treeWithGarlandAndBubbleLights.decorate();

        assertEquals("Christmas tree with garland with bubble lights", decorate);
    }
}