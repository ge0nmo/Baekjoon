import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int a;
            
            switch (num)
            {
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                
                case 2:
                    a = stack.size() != 0 ?  stack.pop() : -1;
                    sb.append(a).append("\n");
                    break;
                    
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                    
                case 4:
                    a = stack.isEmpty() ? 1 : 0;
                    sb.append(a).append("\n");
                    break;
                    
                case 5:
                    a = stack.size() != 0 ? stack.peek() : -1;
                    sb.append(a).append("\n");
                    break;
            }      
        }
        
        System.out.print(sb);
        
    }
}