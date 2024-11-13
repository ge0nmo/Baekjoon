import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        StringTokenizer st;

        int[] arr = new int[count];
        
        for(int i = 0; i < count; i++){
            st = new StringTokenizer(br.readLine());
            
            int num = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            
            int result = num % 10;
            for(int j = 0; j < t - 1; j++){
                result = (result * num) % 10;
            }
                        
            if(result == 0){
                System.out.println(10);
            }else{
                System.out.println(result);
            }
                    
        }
        
        
        
    }
    
}