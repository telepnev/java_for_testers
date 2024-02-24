package ru.stqa.geometry;


import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

import static ru.stqa.geometry.figures.Rectangle.printRectangleArea;
import static ru.stqa.geometry.figures.Square.printSquareArea;
import static ru.stqa.geometry.figures.Triangle.printTriangleArea;
import static ru.stqa.geometry.figures.Triangle.printTrianglePerimeter;

public class Geometry {
    public static void main(String[] args) {
        printTriangleArea(new Triangle(1.0, 1.0, 5.0));
        printTrianglePerimeter(new Triangle(1, 1, 2));

    }

}
