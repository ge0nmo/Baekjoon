import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        
        for(int i = 0; i < phone_book.length - 1; i++)
        {
            if(phone_book[i + 1].startsWith(phone_book[i]))
                return false;
        }
            
        
        return answer;
    }
    
    public static boolean check(String str1, String str2)
    {
        int length = Math.min(str1.length(), str2.length());
        
        for(int i = 0; i < length; i++)
        {
            if(str1.charAt(i) != str2.charAt(i))
                return false;
        }
        
        return true;
    
    }
}