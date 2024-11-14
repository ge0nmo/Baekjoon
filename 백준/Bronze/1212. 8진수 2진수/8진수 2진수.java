import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = {"000", "001", "010", "011", "100", "101", "110", "111"};
        StringBuilder sb = new StringBuilder();

        int first = str.charAt(0) - 48;
        sb.append(Integer.parseInt(arr[first]));

        for(int i = 1; i < str.length(); i++){
            sb.append(arr[str.charAt(i) - 48]);   
        }

        System.out.print(sb);
    }
}