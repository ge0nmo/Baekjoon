import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main
{
    public static int arr[];

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        while(st.hasMoreTokens())
        {
            sb.append(binarySearch(Integer.parseInt(st.nextToken()))).append("\n");
        }

        System.out.println(sb);
    }

    public static int binarySearch(int num)
    {

        int start = 0;
        int end = arr.length - 1;


        while(start <= end)
        {
            int mid = (start + end) / 2;
            if(arr[mid] == num)
                return 1;

            else if (arr[mid] < num)
                start = mid + 1;

            else
                end = mid - 1;
        }
        return 0;
    }
}