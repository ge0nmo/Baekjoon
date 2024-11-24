import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        while((str = br.readLine()) != null){
            int upperCaseCount = 0;
            int lowerCaseCount = 0;
            int numCount = 0;
            int spaceCount = 0;

            for(char ch : str.toCharArray()){
                if(ch == ' '){
                    spaceCount++;
                } else if(ch - 0 >= 'a' - 0 && ch - 0 <= 'z' - 0){
                    lowerCaseCount++;
                } else if (ch - 0 >= 'A' - 0 && ch - 0 <= 'Z' - 0){
                    upperCaseCount++;
                } else{
                    numCount++;
                }
            }

            sb.append(lowerCaseCount).append(" ").append(upperCaseCount).append(" ").append(numCount).append(" ").append(spaceCount).append("\n");
        }

        System.out.print(sb);
    }
}