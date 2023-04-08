import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Stack<Integer> stack = new Stack();
        List<Integer> list = new ArrayList();
        
        int date = checkDate(progresses[0], speeds[0]);
        int count = 1;
        stack.push(date);
        
        
        for(int i = 1; i < progresses.length; i++)
        {
            int progress = progresses[i];
            int speed = speeds[i];
            
            date = checkDate(progress, speed);
            
            if(stack.peek() >= date)
            {
                count++;
            }
            
            else
            {
                list.add(count);
                count = 1;
                stack.pop();
                stack.push(date);
            }
            
        
        }
        
        answer = new int[list.size() + 1];
        
        for(int i = 0; i < list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        
        answer[list.size()] = count;
        return answer;
    }
    
    public static int checkDate(int progress, int speed)
    {
        int rest = 100 - progress;
        
        if(rest % speed != 0)
            return (rest / speed) + 1;
        
        return rest / speed;
    }
}