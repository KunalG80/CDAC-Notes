namespace shapeLib;

 class Cone : Shape
{
public double radius {get; set;}
public double height {get; set;}
public Cone (double r , double h)
{
    radius = r;
    height = h;
}
    public override double cal_area()
    {
       return 3.14 * radius*(radius+height);
    }

    public override double cal_vol()
    {
        return (1 / 3) * 3.14 * radius  * radius;
    }
}

