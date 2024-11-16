import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        String[] arr = name.split("-");

        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            sb.append(str.charAt(0));
        }

        System.out.print(sb);
    }
}