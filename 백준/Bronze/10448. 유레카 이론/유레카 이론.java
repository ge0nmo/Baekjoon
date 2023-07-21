import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main
{
    static List<Integer> list = new ArrayList();
    
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        getTriangularNum();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            
            if(validateNum(num))
            {
                sb.append("1").append("\n");
            }
            
            else
            {
                sb.append("0").append("\n");
            }
        }
        
        System.out.print(sb);
    }
    
    public static boolean validateNum(int num)
    {
        for(int i = 0; i < list.size(); i++)
        {
            for(int j = 0; j < list.size(); j++)
            {
                for(int k = 0; k < list.size(); k++)
                {
                    int first = list.get(i);
                    int second = list.get(j);
                    int third = list.get(k);
                    if(first + second + third == num)
                    {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
        
    public static void getTriangularNum()
    {
        int num = 1;
        list.add(num);
        for(int i = 2; num <= 1000; i++)
        {
            num += i;
            list.add(num);
        }
    }
    
}