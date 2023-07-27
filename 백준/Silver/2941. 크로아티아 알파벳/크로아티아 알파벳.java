import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String str[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String s : str)
        {
            word = word.replace(s, "A");
        }

        System.out.println(word.length());
    }
}