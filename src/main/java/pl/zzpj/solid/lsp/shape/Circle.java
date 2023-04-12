package pl.zzpj.solid.lsp.shape;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle implements Shape {
    private final double radius;

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
