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

}