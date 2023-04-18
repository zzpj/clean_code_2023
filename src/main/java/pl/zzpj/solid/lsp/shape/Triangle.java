package pl.zzpj.solid.lsp.shape;

public class Triangle implements Figure {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double calculateArea() {
        double halfOfPerimeter = (a + b + c) / 2.0;
        return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - a) * (halfOfPerimeter - b) * (halfOfPerimeter - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
