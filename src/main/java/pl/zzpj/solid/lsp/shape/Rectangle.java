package pl.zzpj.solid.lsp.shape;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle implements Shape {
    private final double width;
    private final double height;

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }
}
