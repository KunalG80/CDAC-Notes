import Geometry.Circle;
import Geometry.Shape;

public class Program {
    public static void main(String[] args) {
        Shape shape = new Circle(10); 
        System.out.println(shape.Area());
    }
               
}
