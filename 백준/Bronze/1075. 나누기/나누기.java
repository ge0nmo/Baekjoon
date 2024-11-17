import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        N = (N / 100) * 100;
        int result = 0;
        if(N % F != 0){
            result = F - (N % F);
        }

        System.out.printf("%02d%n", result);

    }
}