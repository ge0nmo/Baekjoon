import java.util.*;

class Solution 
{
    public int solution(int x, int y, int n) 
    {
        Queue<Node> que = new LinkedList();
        boolean visited[] = new boolean[1000001];
        
        que.offer(new Node(x, 0));
        
        while(!que.isEmpty())
        {
            Node cur = que.poll();
            int num = cur.num;
            int depth = cur.depth;
            
            if(num == y)
                return depth;
            
            if(num + n <= y && !visited[num + n])
            {
                que.offer(new Node(num + n, depth + 1));
                visited[num + n] = true;
            }
            
            if(num * 2 <= y && !visited[num * 2])
            {
                que.offer(new Node(num * 2, depth + 1));
                visited[num * 2] = true;
            }
            
            if(num * 3 <= y && !visited[num * 3])
            {
                que.offer(new Node(num * 3, depth + 1));
                visited[num * 3] = true;
            }
        }
        
        return -1;
        
    }

}

class Node
{
    int num;
    int depth;
    
    public Node(int num, int depth)
    {
        this.num = num;
        this.depth = depth;
    }
}