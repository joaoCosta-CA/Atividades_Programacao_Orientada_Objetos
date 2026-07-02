package ExercícioProva2.Shape;

import java.util.ArrayList;
import java.util.List;


public class Principal {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Shape circle = new Circle();
        Shape square = new Square();
        Shape shape = new Shape();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(shape);

        for(Shape s: shapes){
            s.draw();
        }
    }
}