using System;

class Bannercall
{
    public static void Main(string[] args)
    {
        Banner a = new Banner();
        double w,h;
        Console.WriteLine("Price of Standard Banner :"+a.Price());

       

        w = Double.Parse(args[0]);
        h = Double.Parse(args[1]);
    
        
        Banner c = new Banner();
        c.Resize(w,h);
        Console.WriteLine("New Dimensions : "+c.Price());

        c.Reshape(Geometry.Triangular);
        Console.WriteLine("Triangular : "+c.Price());

        c.Reshape(Geometry.Elliptical);
         Console.WriteLine("Elliptical : "+c.Price());


    } 



}

