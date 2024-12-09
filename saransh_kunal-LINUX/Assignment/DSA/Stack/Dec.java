import java.util.Scanner;

public class Dec {
    

     public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Stack_Class obj=new Stack_Class();

        System.out.println("enter the no.");
        int no= in.nextInt();
        obj.create_stack(64);
        while(no!=0){
            obj.push(no%2);
            no=no/2;    
        }
        System.out.println("binary is");


        // obj.print_stack();
        while(!obj.is_empty()){
            System.out.print(obj.pop());
        }
        
       
    }

}
