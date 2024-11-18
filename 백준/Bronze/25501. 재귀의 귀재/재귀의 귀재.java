import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            String s = br.readLine();
            int[] answer = isPalindrome(s);
            
            sb.append(answer[0]).append(" ").append(answer[1]).append("\n");
        }
        
        System.out.print(sb);
    }
    
    public static int[] recursion(String s, int l, int r, int[] answer){
        answer[1]++;
        if(l >= r) {
            answer[0] = 1;            
            return answer;
        }
        else if(s.charAt(l) != s.charAt(r)){            
            return answer;
        }
        
        else return recursion(s, l+1, r-1, answer);
    }
    public static int[] isPalindrome(String s){
        int[] answer = {0, 0};
        return recursion(s, 0, s.length()-1, answer);
    }
       
}