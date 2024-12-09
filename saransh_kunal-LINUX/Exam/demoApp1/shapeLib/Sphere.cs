namespace shapeLib;

 class Sphere : Shape
{
public double radius {get; set;}
public Sphere (double r)
{
    radius = r;
}
    public override double cal_area()
    {
       return 4 * 3.14 * radius * radius;
    }

    public override double cal_vol()
    {
        return (4 / 3) * 3.14 * radius * radius * radius;
    }
}

