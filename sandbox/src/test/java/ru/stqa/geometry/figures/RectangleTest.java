package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {
    @Test
    void rectangle() {
        Assertions.assertEquals(20.0, new Rectangle(4.0, 5.0).rectangle());
    }
    @Test
    void cannotCreateRectangleWithNegativeSide() {
        try {
            new Rectangle(-5, -5);
            Assertions.fail();
        } catch (IllegalArgumentException e) {
            //ok
        }
    }
    @Test
    public void testPass() {
        var r1 = new Rectangle(5.0, 4.0);
        var r2 = new Rectangle(5.0, 4.0);
        Assertions.assertTrue(r1.equals(r2));
    }

    @Test
    public void testPass2() {
        var r1 = new Rectangle(5.0, 4.0);
        var r2 = new Rectangle(4.0, 5.0);
        Assertions.assertTrue(r1.equals(r2));
    }

}