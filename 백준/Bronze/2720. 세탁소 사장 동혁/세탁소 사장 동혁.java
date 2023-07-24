import java.io.*;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++)
        {
            int money = Integer.parseInt(br.readLine());
            sb.append(solution(money));
            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static StringBuilder solution(int money)
    {
        StringBuilder sb = new StringBuilder();
        int quarter = 25;
        int dime = 10;
        int nikel = 5;
        int penny = 1;

        sb.append(money/quarter).append(" ");
        money %= quarter;

        sb.append(money/dime).append(" ");
        money %= dime;

        sb.append(money/nikel).append(" ");
        money %= nikel;

        sb.append(money/penny);


        return sb;
    }
}