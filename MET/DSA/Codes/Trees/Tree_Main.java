import java.util.Scanner;
public class Tree_Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int choice;
        Tree_Class obj=new Tree_Class();
        do
        {
            System.out.print("\nTree Menu");
            System.out.print("\n-----------");
            System.out.print("\n1.Insert");
            System.out.print("\n2.Inorder");
            System.out.print("\n3.Preorder");
            System.out.print("\n4.Postorder");
            System.out.print("\n5.Search");
            System.out.print("\n6.Count Nodes");
            System.out.print("\n7.Leaf Count Nodes");
            System.out.print("\n0.Exit");
            System.out.print("\nchoice:");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                        System.out.print("\nEnter element:");
                        int e=in.nextInt();
                        Tnode n=new Tnode(e);
                        obj.insert(obj.root,n);
                        break;
                case 2:
                    if(obj.root!=null)//not empty
                    {
                        System.out.print("\nInorder->Elements in tree:\n");
                        obj.inorder(obj.root);
                    }
                    else
                    {
                        System.out.print("\nTree not created...");
                    }
                    break;
                case 3:
                    if(obj.root!=null)//not empty
                    {
                        System.out.print("\nPreorder->Elements in tree:\n");
                        obj.preorder(obj.root);
                    }
                    else
                    {
                        System.out.print("\nTree not created...");
                    }
                    break;
                case 4:
                    if(obj.root!=null)//not empty
                    {
                        System.out.print("\nPost order->Elements in tree:\n");
                        obj.postorder(obj.root);
                    }
                    else
                    {
                        System.out.print("\nTree not created...");
                    }
                    break;
                case 5:
                    System.out.print("\nEnter element to search:");
                    e=in.nextInt();
                    System.out.println(e+" found in tree:"+obj.search(e,obj.root));

                    break;
                case 6:
                    System.out.println("Total nodes in tree:"+obj.count_node(obj.root));
                    break;
                case 7:
                    System.out.println("Total leaf nodes in tree:"+obj.count_leaf_node(obj.root));
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