public class Main {
    void DFS(int source)
    {
        visited[source]=1;
        System.out.println("V"+source);
        for(int i=0;i<v;i++)
        {
            if(g[source][i]==1 && visited[i]!=1)
            //neighbour and unvisited
            {
                DFS(i);
            }
        }
    }

    void BFS(int source)
    {   
        int q[]=new int[v];
        int front=0,rear=-1;
        visited[source]=1;
        q[++rear]=source;//enqueue
        while(front<=rear)//not empty
        {   
            int element=q[front++];//dequeue
            System.out.print("V"+element+"-");

            for(int i=0;i<v;i++)
            {  
                if(g[element][i]==1 && visited[i]!=1)//neighbour and unvisited
                {   
                    visited[i]=1;//visited
                    q[++rear]=i;//enqueue
                }
            }
        }
    }

    
}