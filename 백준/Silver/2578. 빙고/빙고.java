import java.util.*;
import java.io.*;

public class Main
{
    static int zeroCount = 0;
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Node> map = new HashMap();
        int bingo[][] = new int[5][5];


        for(int i = 0; i < 5; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++)
            {
                int num = Integer.parseInt(st.nextToken());
                bingo[i][j] = num;
                map.put(num, new Node(i, j));
            }
        }

        int count = 0;
        boolean isOver = false;
        for(int i = 0; i < 5; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++)
            {
                count++;
                int num = Integer.parseInt(st.nextToken());
                Node node = map.get(num);
                bingo[node.x][node.y] = 0;

                if(checkRow(bingo) + checkColumn(bingo) + checkDiagonalL(bingo) + checkDiagonalR(bingo) >= 3)
                {
                    System.out.println(count);
                    isOver = true;
                    break;
                }
            }

            if(isOver)
                break;
        }

    }

    public static int checkRow(int bingo[][])
    {
        int count = 0;
        for(int i = 0; i < 5; i++)
        {
            boolean isZero = true;
            for(int j = 0; j < 5; j++)
            {
                if(bingo[i][j] != 0)
                {
                    isZero = false;
                    break;
                }
            }
            if(isZero)
                count++;
        }

        return count;
    }

    public static int checkColumn(int bingo[][])
    {
        int count = 0;
        for(int i = 0; i < 5; i++)
        {
            boolean isZero = true;
            for(int j = 0; j < 5; j++)
            {
                if(bingo[j][i] != 0)
                {
                    isZero = false;
                    break;
                }
            }
            if(isZero)
                count++;
        }

        return count;
    }

    public static int checkDiagonalL(int bingo[][])
    {
        for(int i = 0; i < 5; i++)
        {
            if(bingo[i][i] != 0)
                return 0;
        }

        return 1;
    }

    public static int checkDiagonalR(int bingo[][])
    {
        for(int i = 0; i < 5; i++)
        {
            if(bingo[i][4 - i] != 0)
                return 0;
        }

        return 1;
    }
}

class Node
{
    int x;
    int y;
    public Node(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}