import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Stack<Integer> stack = new Stack();
        
        for(int i = 0; i < prices.length - 1; i++)
        {
            stack.push(prices[i]);
            
            for(int j = i + 1; j < prices.length; j++)
            {
                int index = stack.peek();
                if(prices[j] >= index)
                {
                    answer[i]++;
                }
                else
                {
                    answer[i] = j - i;
                    break;
                }
            }
            stack.clear();
        }
        
        return answer;
    }
}