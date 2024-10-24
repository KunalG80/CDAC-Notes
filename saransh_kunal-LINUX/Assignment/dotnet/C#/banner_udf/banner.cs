using System;
enum Geometry {Rectangular, Triangular, Elliptical};

struct Banner
{
    private double region;
    private Geometry shape;

    public Banner()
    {
        region = 20.0 * 5.0;
        shape = Geometry.Rectangular;
    } 

    public void Resize(double w, double h)
    {
        region = w * h;
    }

    public void Reshape(Geometry s)
    {
        shape = s;
    }

    public double Price()
    {
        double rate = region >= 100 ? 0.20:0.10;
        double wastage;
        switch(shape)
        {
            case Geometry.Triangular:
                wastage = 0.5;
                break;
            case Geometry.Elliptical:
                wastage = 0.22;
                break;
	    default:
                wastage = 0;
	    	break;
        }
        return region * rate * (1 - 0.6 * wastage);
    }


}

