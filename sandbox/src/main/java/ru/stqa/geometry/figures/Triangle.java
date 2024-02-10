package ru.stqa.geometry.figures;

import java.math.BigDecimal;
import java.math.RoundingMode;

public record Triangle(double a, double b, double c) {
    public static void printTriangleArea(Triangle s) {
        String text = String.format("Площадь треугольника со сторонами %.2f и %.2f и %.2f = %.2f ", s.a, s.b, s.c, s.area());
        System.out.println(text);
    }

    public double area() {
        double semiperimeter = (this.a + this.b + this.c) / 2;
        double triangleArea = semiperimeter * ((semiperimeter - this.a) * (semiperimeter - this.b) * (semiperimeter - this.c));
        double geronResult = Math.sqrt(triangleArea);

        BigDecimal bd = new BigDecimal(geronResult);
        // округление до ближайшего числа с указанной точностью
        // иначе тесты не проходят
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double result = bd.doubleValue();
        return result;
    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }
}
