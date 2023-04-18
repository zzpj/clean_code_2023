package pl.zzpj.solid.lsp.shape;

public class Circle implements Figure {

    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * 2 * r;
    }
}
