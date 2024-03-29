package ru.stqa.geometry.figures;

import java.math.BigDecimal;
import java.math.RoundingMode;

public record Triangle(double a, double b, double c) {
    public Triangle {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Triangle side should be non-negative");
        } if (((a + b) < c) || ((b + c) < a) || ((a + c) < b)) {
            throw new IllegalArgumentException("The sum of any two sides must be no less than the third side");
        }
    }
    public static void printTriangleArea(Triangle s) {
        String text = String.format("Площадь треугольника со сторонами %.2f и %.2f и %.2f = %.2f ", s.a, s.b, s.c, s.calculateAreaTriangle());
        System.out.println(text);
    }

    public static void printTrianglePerimeter(Triangle s) {
        String text = String.format("Периметр треугольника со сторонами %.2f и %.2f и %.2f = %.2f ", s.a, s.b, s.c, s.calculateTrianglePerimeter());
        System.out.println(text);
    }

    public double calculateAreaTriangle() {
        double semiperimeter = calculateTrianglePerimeter() / 2;
        double triangleArea = semiperimeter * ((semiperimeter - this.a) * (semiperimeter - this.b) * (semiperimeter - this.c));
        double geronResult = Math.sqrt(triangleArea);

        BigDecimal bd = new BigDecimal(geronResult);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double result = bd.doubleValue();
        return result;
    }

    public double calculateTrianglePerimeter() {
        return this.a + this.b + this.c;
    }


}
