package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    void canCalculateAre() {
        var s = new Square(5.0);
        double result = s.calculateSquareArea();
        Assertions.assertEquals(25.0, result);

    }

    @Test
    void canCalculatePerimeterSquare() {
        Assertions.assertEquals(16.0, new Square(4.0).calculatePerimeterSquare());
    }

    @Test
    void cannotCreateSquareWithNegativeSide() {
        try {
            new Square(-5);
            Assertions.fail();
        } catch (IllegalArgumentException e) {
            //ok
        }
    }

    @Test
    public void testEqual() {
        var s1 = new Square(5.0);
        var s2 = new Square(5.0);
        Assertions.assertEquals(s1, s2);
    }
    @Test
    public void testNotEqual() {
        var s1 = new Square(5.1);
        var s2 = new Square(5.0);
        Assertions.assertNotEquals(s1, s2);
    }
    @Test
    public void testFail() {
        var s1 = new Square(5.0);
        var s2 = new Square(5.0);
        Assertions.assertTrue(s1 == s2);
    }

    @Test
    public void testPass() {
        var s1 = new Square(5.0);
        var s2 = new Square(5.0);
        Assertions.assertTrue(s1.equals(s2));
    }

}