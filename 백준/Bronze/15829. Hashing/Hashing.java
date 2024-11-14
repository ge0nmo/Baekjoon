import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());        
        String str = br.readLine();
        long answer = 0;
        int M = 1234567891;
        for(int i = 0; i < length; i++){
            int n = str.charAt(i) - 96;
            long a = 1;
            for(int j = 0; j < i; j++){
                a = (a * 31) % M;
            }
            long temp = (n * a) % M;
            answer += temp;
            answer %= M;
            
        }

        System.out.print(answer);
    }
}