package Geometry;

public class Circle extends Shape {
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double Area() {
        return 3.14 * radius * radius;
    }
}
