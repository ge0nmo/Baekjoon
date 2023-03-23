import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        
        for(int i = 0; i < str1.length() - 1; i++)
        {
            if(Character.isAlphabetic(str1.charAt(i)) && Character.isAlphabetic(str1.charAt(i + 1)))
            {
                String s = String.valueOf(str1.charAt(i)) + String.valueOf(str1.charAt(i + 1));
                map1.put(s, map1.getOrDefault(s, 0) + 1);
            }
        }

        for(int i = 0; i < str2.length() - 1; i++)
        {
            if(Character.isAlphabetic(str2.charAt(i)) && Character.isAlphabetic(str2.charAt(i + 1)))
            {
                String s = String.valueOf(str2.charAt(i)) + String.valueOf(str2.charAt(i + 1));
                map2.put(s, map2.getOrDefault(s, 0) + 1);
            }
        }
        
        int min = 0;
        int max = 0;
        
        for(String s : map1.keySet())
        {
            if(map2.containsKey(s))
            {
                min += Math.min(map1.get(s), map2.get(s));
                max += Math.max(map1.get(s), map2.get(s));
                map2.remove(s);
            }
            
            else
                max += map1.get(s);
        }
        
        for(String s : map2.keySet())
        {
            max += map2.get(s);
        }
    
        if(min == 0 && max == 0)
            return 65536;
        
        return min * 65536 / max;    
    }
}