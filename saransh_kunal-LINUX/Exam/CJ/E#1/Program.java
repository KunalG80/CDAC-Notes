
import Shape.Figure;
import Shape.cube;
import Shape.cylinder;
import Shape.sphere;


public class Program {
    
    public static void main(String[] args){

        Figure figure = new cube(10, 20);
        System.out.println("The Volume of CUBE is "+figure.calVolume());

        Figure figure2 = new cylinder(10);
        System.out.println("The Volume of CYLINDER is "+figure2.calVolume());

        Figure figure3 = new sphere(10);
        System.out.println("The Volume of SPHERE is "+figure3.calVolume());


    }
}
