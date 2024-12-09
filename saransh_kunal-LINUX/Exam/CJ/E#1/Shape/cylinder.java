package Shape;

public class cylinder extends Figure {

    public double a;


    public cylinder(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    } 


    @Override
    public double calVolume() {
        return a * a* a;
    }
    
}
