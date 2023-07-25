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
        int arr[] = new int[26];
        arr[word.charAt(0) - 'a'] = 1;
        for(int i = 1; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            if(ch != word.charAt(i - 1))
            {
                if(arr[ch - 'a'] != 0) //0이 아니다 = 이미 나온 문자이다.
                     return false;
                
                arr[ch - 'a'] = 1;
            }
        }
        return true;
    }
    
}