namespace shapeLib;

 class Box : Shape
{
public double length {get; set;}
public double breath {get; set;}
public double height {get; set;}
public Box (double l , double b, double h)
{
    length = l;
    breath = b;
    height = h;
}
    public override double cal_area()
    {
       return 2*((length * breath) + (height*breath) + (length * height) );
    }

    public override double cal_vol()
    {
        return length * breath * height;
    }
}

