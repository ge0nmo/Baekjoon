import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        
        Stack<Character> stack = new Stack();
        
        for(char x : s.toCharArray())
        {
            if(!stack.isEmpty() && stack.peek() == x)
                stack.pop();
            
            else
                stack.push(x);
        }
        
        if(stack.isEmpty())
            return 1;

        return 0;
    }
}