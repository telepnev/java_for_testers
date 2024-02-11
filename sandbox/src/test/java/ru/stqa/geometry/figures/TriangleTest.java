package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class TriangleTest {

    @Test
    void canCalculateAreaTriangle() {
        Assertions.assertEquals(5.18, new Triangle(6.1, 5.0, 2.2).calculateAreaTriangle());
    }

    @Test
    public void canCalculatePerimeter() {
        Assertions.assertEquals(6.9, new Triangle(2.1, 2.1, 2.7).calculateTrianglePerimeter());
    }
}