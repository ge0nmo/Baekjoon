import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> map = new HashMap();
        
        for(String str : keymap)
        {
            for(int i = 0; i < str.length(); i++)
            {
                char ch = str.charAt(i);
                int min = i + 1;
                
                if(map.containsKey(ch))
                {
                    min = Math.min(map.get(ch), min);
                }
                
                map.put(ch, min);
            }
        }
        
        for(int i = 0; i < targets.length; i++)
        {
            int num = 0;
            String str = targets[i];
            for(char ch : str.toCharArray())
            {
                if(map.containsKey(ch))
                {
                    num += map.get(ch);                   
                }
 
                else
                {
                    num = -1;
                    break;
                }
            }
            
            answer[i] = num;
        }
        
        
        return answer;
    }
}