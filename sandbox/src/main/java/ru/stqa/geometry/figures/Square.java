package ru.stqa.geometry.figures;

public record Square(double side) {
    public Square {
        if(side < 0) {
            throw new IllegalArgumentException("Square side should be non-negative");
        }
    }

    public static void printSquareArea(Square s) {
        String text = String.format("Площадь квадрата со стороной %.2f = %.2f ", s.side, s.calculateSquareArea());
        System.out.println(text);
    }

    public double calculateSquareArea() {
        return this.side * this.side;
    }

    public double calculatePerimeterSquare() {
        return 4 * this.side;
    }
}
