import java.io.*;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        
        System.out.print(check(word));
        
    }
    
    public static int check(String word)
    { 
        for(int i = 0; i < word.length() / 2; i++)
        {
            if(word.charAt(i) != word.charAt(word.length() - 1 - i))
            {
                return 0;
            }
        }
        return 1;
    }
}