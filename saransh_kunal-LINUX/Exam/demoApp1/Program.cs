// See https://aka.ms/new-console-template for more information
using shapeLib;

Shape[] S  = {
    new Sphere(5),
    new Cone(3,7),
};
foreach(Shape s in S){
    Console.WriteLine($"area is {s.cal_area()}");
    Console.WriteLine($"area is {s.cal_vol()}");
}