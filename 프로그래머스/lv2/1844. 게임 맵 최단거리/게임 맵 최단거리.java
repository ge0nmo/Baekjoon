import java.util.*;

class Solution 
{
    static int dx[] = {0, -1, 1, 0};
    static int dy[] = {-1, 0, 0, 1};
    static int X;
    static int Y;
    static Queue<Node> que = new LinkedList<>();
    static boolean visited[][];
    static int answer = -1;
    
    public static void bfs(int maps[][], int x, int y, int dist)
    {
        que.offer(new Node(x, y, dist));
        visited[x][y] = true;
        
        while(!que.isEmpty())
        {
            Node cur = que.poll();

            for(int i = 0; i < 4; i++)
            {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                int distance = cur.dist + 1;
                
                if(nx >= 0 && ny >= 0 && nx < X && ny < Y && visited[nx][ny] == false && maps[nx][ny] == 1)
                {
                    visited[nx][ny] = true;
                    que.offer(new Node(nx, ny, distance));
                    
                    if(nx == X - 1 && ny == Y - 1)
                        answer = distance + 1;
                }
            }
            
        }
        
    }
    
    public int solution(int[][] maps) 
    {
        X = maps.length;
        Y = maps[0].length;
        
        visited = new boolean[X][Y];
    
            
        bfs(maps, 0, 0, 0);
        
        return answer;
    }
}

class Node
{
    int x;
    int y;
    int dist;
    
    public Node(int x, int y, int dist)
    {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}