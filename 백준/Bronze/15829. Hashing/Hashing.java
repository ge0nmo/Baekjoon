import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());        
        String str = br.readLine();
        int answer = 0;
        for(int i = 0; i < length; i++){
            int n = str.charAt(i) - 96;
            answer += n * (int)Math.pow(31, i);
        }

        System.out.print(answer);
    }
}