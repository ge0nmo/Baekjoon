import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        List<Character> list = new ArrayList();
        
        for(char word : skip.toCharArray())
        {
            list.add(word);
        }
        
        for(char word : s.toCharArray())
        {
            for(int i = 0; i < index; i++)
            {
                ++word;
                
                if(word > 'z')
                    word = 'a';
                
                while(list.contains(word))
                {
                    ++word;
                    if(word > 'z')
                        word = 'a';
                }
            }
            sb.append(word);
            
        }

        return sb.toString();
    }
    
}