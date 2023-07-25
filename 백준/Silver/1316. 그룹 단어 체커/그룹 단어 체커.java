import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String argsp[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        
        for(int i = 0; i < n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            String word = st.nextToken();
            if(check(word))
                count++;
        }
        
        System.out.print(count);
        
    }
    
    public static boolean check(String word)
    {
        Set<Character> set = new HashSet();
        set.add(word.charAt(0));
        
        for(int i = 1; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            
            if(ch != word.charAt(i - 1))
            {
                if(!set.contains(ch))
                    set.add(ch);
                
                else
                    return false;
            }
            
            
        }
        
        return true;
    }
    
}