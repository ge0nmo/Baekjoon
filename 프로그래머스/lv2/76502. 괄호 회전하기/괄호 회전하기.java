import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if(check(s))
            answer++;
        
        for(int i = 1; i < s.length(); i++)
        {
            String temp = s.substring(0, i);
            s = s.substring(i);
            
            s = s + temp;
            
            if(check(s))
                answer++;
        }
        
        return answer;
    }
    
    public static boolean check(String s)
    {
        Stack<Character> stack = new Stack();
        
        for(char a : s.toCharArray())
        {
            if(a == '(')
                stack.push(')');
            
            else if(a == '[')
                stack.push(']');
            
            else if(a == '{')
                stack.push('}');
            
            else if(stack.isEmpty() || a != stack.pop())
                return false;
                
        }
        
        return stack.isEmpty();
    }
}