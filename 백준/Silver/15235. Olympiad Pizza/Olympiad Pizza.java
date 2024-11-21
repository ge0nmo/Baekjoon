import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < N; i++){
            queue.add(new int[]{i, arr[i]});
        }

        int count = 1;
        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            cur[1]--;

            if(cur[1] > 0){
                queue.add(cur);
            } else{
                arr[cur[0]] = count;
            }
            count++;
        }

        for(int result : arr){
            sb.append(result).append(" ");
        }

        System.out.print(sb);
    }

}