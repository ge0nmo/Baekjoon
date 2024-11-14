import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int x1 = Integer.parseInt(arr[0]);
        int y1 = Integer.parseInt(arr[1]);
        int c1 = Integer.parseInt(arr[2]);
        int x2 = Integer.parseInt(arr[3]);
        int y2 = Integer.parseInt(arr[4]);
        int c2 = Integer.parseInt(arr[5]);
       
        int D = (x1 * y2) - (x2 * y1);
        
        System.out.println((c1 * y2 - y1 * c2) / D + " " + (x1 * c2 - c1 * x2) / D);
        
        
    }
    
}