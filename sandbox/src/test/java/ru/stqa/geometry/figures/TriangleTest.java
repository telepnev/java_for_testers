package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class TriangleTest {

    @Test
    public void testCanCalculateAreaTriangle() {
        assertEquals(5.18, new Triangle(6.1, 5.0, 2.2).calculateAreaTriangle());
    }

    @Test
    public void testCanCalculatePerimeter() {
        assertEquals(6.9, new Triangle(2.1, 2.1, 2.7).calculateTrianglePerimeter());
    }

    @Test
    public void testCannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(1, 0, -1);
            Assertions.fail();
        } catch (IllegalArgumentException e) {
            //ok
        }
    }

    @Test
    public void testSumTwoSidesLess() {
        try {
            new Triangle(1, 1, 6);
            Assertions.fail();
        } catch (IllegalArgumentException e) {
            //ok
        }
    }

    @Test
    public void testSTwoSidesLessVersionTwo() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 1, 6));
    }

    @Test
    public void testTriangleNegativeSides() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(-1, 2, 3));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, -2, 3));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 2, -3));
    }

    @Test
    public void testTriangleInvalidSides() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 2, 6));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 6, 2));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(6, 2, 1));
    }
}