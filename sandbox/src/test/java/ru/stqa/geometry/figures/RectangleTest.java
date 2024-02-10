package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void rectangle() {
        Assertions.assertEquals(20.0, new Rectangle(4.0, 5.0).rectangle());
    }

}