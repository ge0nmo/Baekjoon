import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        
        for(int i = 0; i < s.length() - 1; i++)
        {
            if(check(s))
                answer++;
            
            char word = s.charAt(0);
            s = s.substring(1) + word;
            
        }
        
        
        return answer;
    }
    
    public static boolean check(String s)
    {
        Stack<Character> stack = new Stack();
        
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
                stack.push(')');
            
            else if(ch == '{')
                stack.push('}');
            
            else if(ch == '[')
                stack.push(']');
            
            else if (stack.isEmpty() || ch != stack.pop())
                return false;
                
        }
        
        return stack.isEmpty();
    }
}