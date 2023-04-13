import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int idx = 0;
        
        Map<String, Integer> map = new HashMap();
        for(int i = 0; i < name.length; i++)
        {
            map.put(name[i], yearning[i]);
        }
        
        for(String str[] : photo)
        {
            int sum = 0;
            for(String x : str)
            {
                if(map.containsKey(x))
                {
                    sum += map.get(x);
                } 
            } 
            answer[idx++] = sum;
            
        }
        
        
        return answer;
    }
}