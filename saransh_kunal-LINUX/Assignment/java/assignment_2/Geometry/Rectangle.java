package Geometry;

public class Rectangle extends Shape {
    public double length;
    public double breath;

    public Rectangle(double length, double breath){
        this.length = length;
        this.breath = breath;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    
    public double getBreath(){
        return breath;
    }

    public void setBreath(double breath){
        this.breath = breath;
    }

    @Override
    public double Area() {
    return length * breath;   
       
    }
}
