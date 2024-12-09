import java.util.Scanner;

public class LinkedList_menudriven2{
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        method obj=new method();
        System.out.println("Enter size of List:");
        int choice;
        int e=in.nextInt();
        obj.create_List();
        do
        {
            System.out.print("\nLinkedList Menu");
            System.out.print("\n-----------");
            System.out.print("\n1.Insert Left");
            System.out.print("\n2.Insert Right");
            System.out.print("\n3.Delete Left");
            System.out.print("\n4.Delete Right");
            System.out.print("\n5.Search in LinkedList");
            System.out.print("\n6.Delete in linkedList");
            System.out.print("\n7.Print LinkedList");
            System.out.print("\n0.Exit");
            System.out.print("\nchoice:");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("\nEnter element to left:");
                    int e1=in.nextInt();
                    obj.insert_left(e1);;
                    break;
                case 2:
                    System.out.print("\nEnter element to right:");
                    int e2=in.nextInt();
                    obj.insert_right(e2);;
                    break;
                case 3:
                    System.out.print("\ndeleted element in left:");
                    obj.delete_left();
                    break;
                case 4:
                    System.out.print("\ndeleted element in right:");
                    obj.delete_right();
                    break;
                case 5:
                    System.out.println("\nElements on List");
                    int e3=in.nextInt();
                    obj.search(e3);
                    break;
                case 6:
                    System.out.println("\nElements on List");
                    int e4=in.nextInt();
                    // obj.delete(e4);
                    break;
                case 7:
                    System.out.println("\nElements on List");
                    obj.print_list();
                    break;
                    case 8:
                    System.out.println("\nElements on List");
                    int e5 =in.nextInt();
                    int ref=in.nextInt();
                    obj.insert_after(ref, e5);   ;
                    break;
                case 0:
                    System.out.print("\nExiting code...bye");
                    break;
                default:
                    System.out.print("\nWrong option selected..");
                    break;
            }
        }while(choice!=0);
    }
}
