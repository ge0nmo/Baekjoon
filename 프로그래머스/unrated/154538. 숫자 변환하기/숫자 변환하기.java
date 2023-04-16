import java.util.*;

class Solution 
{
    static Queue<Node> que = new LinkedList();
    static boolean check[] = new boolean[1000001];
    
    public int solution(int x, int y, int n) {
        int answer = 0;
        
        answer = bfs(x, y, n);
        
        return answer;
    }
    
    public static int bfs(int x, int y, int n)
    {
        que.offer(new Node(x, 0));
        
        
        while(!que.isEmpty())
        {
            Node cur = que.poll();
            int num = cur.num;
            int depth = cur.depth;
            
            if(num == y)
                return depth;
            
            if(num + n <= y && !check[num + n])
            {
                que.offer(new Node(num + n, depth + 1));
                check[num + n] = true;
            }
            
            if(num * 2 <= y && !check[num * 2])
            {
                que.offer(new Node(num * 2, depth + 1));
                check[num * 2] = true;
            }
            
            if(num * 3 <= y && !check[num * 3])
            {
                que.offer(new Node(num * 3, depth + 1));
                check[num * 3] = true;
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