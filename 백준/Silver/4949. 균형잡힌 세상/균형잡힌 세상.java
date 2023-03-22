import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;

        while(true)
        {
            str = br.readLine();

            if(str.equals("."))
                break;

            if(check(str) == true)
                sb.append("yes").append("\n");
            else
                sb.append("no").append("\n");
        }

        System.out.println(sb);

    }

    public static boolean check(String str)
    {
        Stack<Character> stack = new Stack<>();

        for(Character i : str.toCharArray())
        {
            if(i == '(' || i == '[')
                stack.push(i);

            else if(i == ')')
            {
                if(stack.isEmpty() || stack.pop() != '(')
                    return false;
            }
            
            else if(i == ']')
            {
                if(stack.isEmpty() || stack.pop() != '[')
                    return false;
            }
        }
        


        return stack.isEmpty();
    }
}