package ru.stqa.geometry.figures;

public record Rectangle(double a, double b) {
    public Rectangle {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Rectangle side should be non-negative");
        }
    }

    public static void printRectangleArea(Rectangle s) {
        String text = String.format("Площадь прямоугольника со стороной %.2f и %.2f = %.2f ", s.a, s.b, s.rectangle());
        System.out.println(text);
    }

    public double rectangle() {
        return this.a * this.b;
    }
}
