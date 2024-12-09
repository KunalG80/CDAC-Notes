package Shape;

public class sphere extends Figure {

    public double a;


    public sphere(double a) {
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
        return 3.14 * a *a *a;
    }
}
