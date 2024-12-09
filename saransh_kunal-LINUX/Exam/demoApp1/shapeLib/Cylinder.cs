namespace shapeLib;

 class Cylinder : Shape
{
public double radius {get; set;}
public double height {get; set;}
public Cylinder (double r , double h)
{
    radius = r;
    height = h;
}
    public override double cal_area()
    {
       return 2 * 3.14 * radius*(height+radius);
    }

    public override double cal_vol()
    {
        return  3.14 * radius  * radius;
    }
}

