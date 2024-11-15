import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();        

        String[] arr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet",
                       "grey", "white"};
        
        long ab = (long)(Arrays.asList(arr).indexOf(a) * 10 + Arrays.asList(arr).indexOf(b));
        System.out.print(ab * (long)Math.pow(10, Arrays.asList(arr).indexOf(c))); 
    }
}