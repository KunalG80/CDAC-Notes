import java.util.Scanner;

public class Stack_Reversal {
     public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Stack_Class obj=new Stack_Class();

        System.out.println("enter word to reverse");
        String word = in.next();
        obj.create_stack(word.length());
        for(int i=0;i<word.length();i++){
            obj.push(word.charAt(i));
        }
        String rword =" ";
        while(!obj.is_empty()){
            rword=rword+(char)obj.pop();
        }
        System.out.println("Reversed word is: "+rword);

    }



}
