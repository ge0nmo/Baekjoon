import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main 
{
	public static float[] student;
	public static void main(String[] args) throws IOException 
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int C = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= C; tc++){
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			student = new float[N+1];
			float average = 0L;
			for(int i = 1; i <= N; i++)
            {
				student[i] = Integer.parseInt(st.nextToken());
				average += student[i];
			}
			average /= N;
			float count = 0;
			for(int i = 1; i <= N; i++)
            {
				if(student[i] > average)
                {
					count++;
				}
			}
			System.out.printf("%.3f",count/N * 100);
			System.out.print("%");
			System.out.println();
		}
	}
}
