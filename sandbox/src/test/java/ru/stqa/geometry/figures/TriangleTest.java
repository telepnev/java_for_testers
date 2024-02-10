package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class TriangleTest {

    @Test
    void canCalculateAre() {
        Assertions.assertEquals(5.18, new Triangle(6.1, 5.0, 2.2).triangle());
    }
}