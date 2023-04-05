import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Set<String> set = new HashSet();
        int order = 1;
        set.add(words[0]);
        
        for(int i = 1; i < words.length; i++)
        {
            String word1 = words[i - 1];
            String word2 = words[i];
            
            char end = word1.charAt(word1.length() - 1);
            char start = word2.charAt(0);
            
            set.add(word2);
            
            if(end != start || set.size() != i + 1)
            {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
                
        }
        

        return answer;
    }
}