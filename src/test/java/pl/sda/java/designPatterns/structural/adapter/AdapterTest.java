package pl.sda.java.designPatterns.structural.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdapterTest {
    @Test
    void shouldToyDuckBehaveLikeSparrow() {
        Bird sparrow = new Sparrow();
        BirdAdapter adapter = new BirdAdapter(sparrow);

        String squeakSound = adapter.getSqueakSound();

        Assertions.assertEquals(sparrow.getSound(), squeakSound);
    }
}