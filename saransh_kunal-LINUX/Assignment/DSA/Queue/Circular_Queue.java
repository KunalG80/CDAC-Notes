public class Circular_Queue {
    int front,rear,Maxsize,count,queue[];
    //function members
    void create_queue(int size)
    {
        front=0;
        rear=-1;
        count=0;
        Maxsize=size;
        queue=new int[Maxsize];
    }
    void enqueue(int e)
    {
        rear=(rear+1)%Maxsize;
        queue[rear]=e;
        count++;
    }
    boolean is_full()
    {
        if(count == Maxsize)
            return true;
        else
            return false;
    }
    int dequeue()
    {
        int temp=queue[front];
        front=(front+1)%Maxsize;
        count--;
        return temp;
    }

    boolean is_empty()
    {
        if(count == 0)
            return true;
        else
            return false;
    }
    void print_queue()
    {
        for(int i=front ;i<=Maxsize;i++)
            System.out.print(queue[i]+"---");
    }
}
