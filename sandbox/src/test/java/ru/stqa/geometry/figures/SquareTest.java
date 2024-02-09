package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    void canCalculateAre() {
        double result = Square.area(5);
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void canCalculatePerimeter() {
        double result = Square.perimeter(5);
        Assertions.assertEquals(20.0, result);
    }
}