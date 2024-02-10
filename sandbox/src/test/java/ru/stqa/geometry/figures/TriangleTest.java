package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void canCalculateAre() {
        Assertions.assertEquals(5.28, new Triangle(6.0, 5.0, 2.2).area());
    }

    @Test
    void canCalculatePerimetr() {
        Assertions.assertEquals(13.2, new Triangle(6.0, 5.0, 2.2).perimeter());
    }
}