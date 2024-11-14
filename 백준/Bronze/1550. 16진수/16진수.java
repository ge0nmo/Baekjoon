import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        
        String str = br.readLine();
        int length = str.length();
        int answer = 0;
        for(int i = 0; i < length; i++)
        {            
            char ch = str.charAt(i);
            int n = 'A' > ch ? ch - 48 : ch - 55;
            
            answer += Math.pow(16, length - i - 1) * n;
        }
        
        System.out.print(answer);
    }
    
}