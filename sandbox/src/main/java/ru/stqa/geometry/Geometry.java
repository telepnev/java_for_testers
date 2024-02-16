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
        printSquareArea(new Square(5.0));
        printRectangleArea(new Rectangle(5.0, 4.0));
        printTriangleArea(new Triangle(5.0, 5.0, 5.0));
        printTrianglePerimeter(new Triangle(2, 2, 2));

    }

}
