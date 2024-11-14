import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int min = N;
        long sum = 0;
        for(int i = M; i <= N; i++){
            double square = Math.sqrt(i);
            boolean isSquare = square - (int)square == 0;
            if(isSquare){
                sum += i;
                if(i < min){
                    min = i;
                }

            }
        }

        if(sum == 0){
            System.out.print(-1);
        } else{
            System.out.println(sum);
            System.out.println(min);
        }

    }
}