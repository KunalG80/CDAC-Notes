public class Tree_Class
{
    Tnode root;
    void insert(Tnode r,Tnode n)//r:root ref n:new node
    {
        if(root==null)
            root=n;
        else
        {
            if(n.data<r.data)
            {
                if(r.left==null)
                    r.left=n;
                else
                    insert(r.left,n);
            }
            else
            {
                if(r.right==null)
                    r.right=n;
                else
                    insert(r.right,n);
            }
        }
        System.out.println(n.data+" inserted in tree");
    }
    void inorder(Tnode r)
    {
        if(r!=null)//LPR
        {
            inorder(r.left);//L
            System.out.print(r.data+",");//P
            inorder(r.right);//R
        }
    }
    int count_node(Tnode r)
    {
        if(r==null)
         return 0;
        else
        {
            int l_count=count_node(r.left);
            int r_count=count_node(r.right);
            return 1+l_count+r_count;
        }
    }
    int count_leaf_node(Tnode r)
    {
        if(r==null)
            return 0;
        else
        {
            int count=0;
            if(r.left==null && r.right==null)
                count++;
            return count+count_leaf_node(r.left)+count_leaf_node(r.right);
        }

        }

    void preorder(Tnode r)
    {if(r!=null)//LPR
        {
            System.out.print(r.data+",");//P
            preorder(r.left);//L
            preorder(r.right);//R
        }
    }
    void postorder(Tnode r)
    {if(r!=null)//LPR
        {
            postorder(r.left);//L
            postorder(r.right);//R
            System.out.print(r.data+",");//P
        }
    }
    //create search method which returns true if found in tree else flase
    boolean search(int key,Tnode r)
    {
        if(r!=null) {
            if (key == r.data)//if key is at root return true
                return true;
            else {
                if (key < r.data)//if key< root's data go to left
                    return search(key, r.left);
                else//if key> root's data go to left
                    return search(key, r.right);
            }
        }
        else
            return false;
    }
    //count number of nodes in tree


}