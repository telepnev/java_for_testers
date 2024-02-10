package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void canCalculateAre() {
        double result = Triangle.triangle(6.0, 5.0, 2.2);
        Assertions.assertEquals(5.28, result);
    }
}