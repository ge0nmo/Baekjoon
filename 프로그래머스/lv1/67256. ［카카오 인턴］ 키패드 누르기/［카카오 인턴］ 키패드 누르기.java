import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        
        int left = 10;
        int right = 12;
        
        for(int i = 0; i < numbers.length; i++)
        {
            int num = numbers[i];
            if(num == 0)
                num = 11;
            
            
            if(num % 3 == 1)
            {
                sb.append("L");
                left = num;
            }
            
            else if(num % 3 == 0)
            {
                sb.append("R");
                right = num;
            }
            
            else
            {
                int leftDistance = (Math.abs(num - left)) / 3 + (Math.abs(num - left)) % 3;
                int rightDistance = (Math.abs(num - right)) / 3 + (Math.abs(num - right)) % 3;
                
                if(leftDistance > rightDistance)
                {
                    sb.append("R");
                    right = num;
                }
                
                else if(leftDistance < rightDistance)
                {
                    sb.append("L");
                    left = num;
                }
                
                else
                {
                    if(hand.equals("right"))
                    {
                        sb.append("R");
                        right = num;
                    }
                    
                    else
                    {
                        sb.append("L");
                        left = num;
                    }
                }
            }
        }
        
        return sb.toString();
    }
}