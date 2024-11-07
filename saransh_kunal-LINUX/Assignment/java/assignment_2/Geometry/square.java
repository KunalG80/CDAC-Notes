package Geometry;

public class square extends Shape {
    public double side;

    public double getLSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }

    @Override
    public double Area() {
        return side * side;
        
    }
    
}
