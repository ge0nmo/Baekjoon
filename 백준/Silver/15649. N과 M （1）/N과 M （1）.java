import java.util.*;
import java.io.*;

public class Main
{
    static int n, m;
    static int arr[];
    static boolean check[];
    public static void DFS(int depth)
    {
        if(depth == m)
        {
            for(int x : arr)
            {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        else
        {
            for(int i = 1; i <= n; i++)
            {
                if(check[i] == false)
                {
                    check[i] = true;
                    arr[depth] = i;
                    DFS(depth + 1);
                    check[i] = false;

                }
            }
        }


    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        check = new boolean[n + 1];
        arr = new int[m];

        DFS(0);


    }
}