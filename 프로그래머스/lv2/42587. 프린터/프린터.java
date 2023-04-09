import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        
        Queue<Point> que = new LinkedList();
        
        for(int i = 0; i < priorities.length; i++)
        {
            que.offer(new Point(i, priorities[i]));
        }
        
        while(!que.isEmpty())
        {
            Point current = que.poll();
            
            if(isMax(que, current.priority))
            {
                if(current.num == location)
                    return answer;
                
                else
                    answer++;
            }
            
            else
            {
                que.offer(current);
            }
            
        }
        
        
        return answer + 1;
    }
    
    public static boolean isMax(Queue<Point> que, int index)
    {
        for(Point current : que)
        {
            if(current.priority > index)
                return false;
        }
        
        return true;
    }
}

class Point
{
    public int num, priority;
    
    public Point(int num, int priority)
    {
        this.num = num;
        this.priority = priority;
    }
        
}