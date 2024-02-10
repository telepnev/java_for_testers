package ru.stqa.geometry.figures;

public record Rectangle(double a, double b) {
    public static void printRectangleArea(Rectangle s) {
        String text = String.format("Площадь квадрата со стороной %.2f и %.2f = %.2f ", s.a, s.b, s.rectangle());
        System.out.println(text);
    }
    public double rectangle() {
        return this.a * this.b;
    }
}
