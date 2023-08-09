import java.io.*;
import java.util.*;

public class Main
{
    static int arr[];

    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = i + 1;
        }

        for(int i = 0; i < m; i++)
        {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if(start != end)
                swap(start, end);
        }

        StringBuilder sb = new StringBuilder();
        for(int i : arr)
        {
            sb.append(i).append(" ");
        }
        
        System.out.print(sb);
    }

    public static void swap(int start, int end)
    {
        int length = (end - start + 1) / 2;

        for(int i = 0; i < length; i++)
        {
            int temp = arr[start - 1];
            arr[start - 1] = arr[end - 1];
            arr[end - 1] = temp;
            end--;
            start++;
        }


    }
}