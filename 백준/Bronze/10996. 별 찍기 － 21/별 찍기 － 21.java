import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        boolean isStar = true;
        for(int i = 0; i < n * 2; i++){
            isStar = i % 2 == 0;
            for(int j = 0; j < n; j++){
                if(isStar){
                    sb.append('*');
                    isStar = false;
                }else{
                    sb.append(' ');
                    isStar = true;
                }

            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}