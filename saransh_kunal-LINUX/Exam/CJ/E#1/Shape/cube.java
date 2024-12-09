package Shape;

public class cube extends Figure {

    public double a;

    public double b;


    public cube(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }


    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


    @Override
    public double calVolume() {
        return 2 * 3.14 * a * b;
    }
    
}
