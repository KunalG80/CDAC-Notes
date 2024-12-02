public class Doubly_linked_list {
    
    Dnode root;
    void create_List()
    {
        root=null;

    }
    void insert_left(int data){
        Dnode n = new Dnode(data);
        if(root==null){
            root =n; 
        }   
        else{
            n.right = root;
            root.left = n;
            root = n;
        }
        System.out.println(n.data+" inserted");
    }

    void delete_left(){
        if(root==null){
            System.out.println("empty........root."); 
        }   
        else{
           if(root.right==null){
            root=null;
           }
           else
           {
            Dnode t = root;
            root = root.right;
            root.left=null;
            System.out.println(t.data+"deleted");
           }
        }
        
    }

    void insert_right(int data)
    {
        Dnode n = new Dnode(data);
        if(root==null)
        {
            root = n;
        }
        else{
            Dnode t = root;
            while(t.right!=null){
                t=t.right;
            }
            t.right = n;
            n.left = t;
        }
        System.out.println(n.data+" inserted");
    }

    // void delete_right(){
    //     if(root==null){
    //         System.out.println("empty.........");
    //     }
    //     else{
    //         if(root.left==null)
    //             root=null;
    //         else{
    //             Dnode t = root;
                
    //             while(t.right!=null){

    //                 t=t.right;
    //             }
    //             Dnode t2 = root;
    //             t2=t.left;
    //             t2.right= null;
    //             System.out.println(t.data+"deleeee");
    //         }
           
    //     }
        

    // }
    void delete_right()
    {

        if(root==null)
            System.out.println("\nList Empty");
        else
        {
            Dnode t=root;//1
            // Node t2=root;//1
            while(t.right!=null)//2
            {
    
                t=t.right;
            }
            if(root==t)
                root=null;//3 single node
            else{
              Dnode t2=t.left;//3
                t2.right = null;
            }
        }
    }


//     void print(){
//         if(root==null){
//             System.out.println("empty");
//         }
//         else{
//             Dnode t = root;
//             while(t!=null){
//                 System.out.print(t.data+"--");
//                 t=t.right;
//             }
        

//     }


    
// }
void print()
{
    if(root==null)
        System.out.println("\nList Empty");
    else
    {
        Dnode t=root;//1
        while(t!=null)//2
        {
            System.out.print("|"+t.data+"|->");
            t=t.right;
        }
    }
}

public static void main(String[] args) {


        Doubly_linked_list obj = new Doubly_linked_list();
        obj.create_List();
        obj.insert_left(5);
        obj.insert_left(6);
        obj.insert_left(7);
        obj.print();
        obj.delete_left();
        obj.print();
        obj.insert_right(45);
        obj.insert_right(65);
        obj.insert_right(89);
        obj.insert_right(89);
        obj.insert_right(3333);
        obj.print();
        obj.delete_right();
        obj.print();
    }
}