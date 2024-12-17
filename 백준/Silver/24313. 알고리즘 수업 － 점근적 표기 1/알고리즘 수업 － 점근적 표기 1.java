import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        boolean bigO = true;
        for(int i = n0; i <= 100; i++){
            if((a1 * i) + a0 > c * i){
                bigO = false;
                break;
            }
        }

        System.out.print(bigO ? 1 : 0);

    }
}