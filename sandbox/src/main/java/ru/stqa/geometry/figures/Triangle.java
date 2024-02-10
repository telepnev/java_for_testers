package ru.stqa.geometry.figures;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle {
    public static void printTriangleArea(double a, double b, double c) {
        String text = String.format("Площадь треугольника со сторонами %f и %f и %f = %f ", a, b, c, triangle(a, c, b));
        System.out.println(text);
    }

    public static double triangle(double a, double c, double b) {
        double semiperimeter = (a + b + c) / 2;
        double triangleArea = semiperimeter * ((semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
        double geronResult = Math.sqrt(triangleArea);

        BigDecimal bd = new BigDecimal(geronResult);
       // округление до ближайшего числа с указанной точностью
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double result = bd.doubleValue();
        return result;
    }
}
