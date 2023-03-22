import java.util.*;
import java.io.*;

public class Main
{
    //끝나는 시간을 기준으로 내림차순 정렬. 같으면 시작시간이 빠른 것 부터

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Conference> list = new ArrayList();
        for(int i = 0; i < n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            list.add(new Conference(start, end));
        }

        System.out.print(solution(list));
    }

    public static int solution(List<Conference> list)
    {
        Collections.sort(list);
        int answer = 0;
        int time = 0;

        for(Conference o : list)
        {
            if(o.start >= time)
            {
                answer++;
                time = o.end;
            }
        }

        return answer;
    }
}

class Conference implements Comparable<Conference>
{
    public int start, end;

    public Conference(int start, int end)
    {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Conference o)
    {
        if(o.end == this.end)
            return this.start - o.start;

        else
            return this.end - o.end;
    }
}