import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int count = 10;
        
        char prev = n.charAt(0);
        for(int i = 1; i < n.length(); i++){
            char ch = n.charAt(i);
            
            if(prev == ch){
                count += 5;
            } else{
                count += 10;
            }
            
            prev = ch;            
        }
        
        System.out.print(count);
        
    }
}