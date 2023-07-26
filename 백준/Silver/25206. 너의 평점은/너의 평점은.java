import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        double gradeSum = 0;
        for(int i = 0; i < 20; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();

            double score = Double.valueOf(st.nextToken());
            Double grade = getGrade(st.nextToken());

            if(grade == null)
                continue;

            sum += score * grade;
            gradeSum += score;
        }

        System.out.printf("%.5f\n", sum / gradeSum);

    }

    public static Double getGrade(String grade)
    {

        switch(grade)
        {
            case "A+":
                return 4.5;

            case "A0":
                return 4.0;

            case "B+":
                return 3.5;

            case "B0":
                return 3.0;

            case "C+":
                return 2.5;

            case "C0":
                return 2.0;

            case "D+":
                return 1.5;

            case "D0":
                return 1.0;

            case "F":
                return 0.0;
        }

        return null;
    }
}