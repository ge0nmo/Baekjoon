import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];
        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < M; j++){
                board[i][j] = line.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= N - 8; i++){
            for(int j = 0; j <= M - 8; j++){
                min = Math.min(solution(board, i, j), min);
            }
        }


        System.out.print(min);

    }

    public static int solution(char[][] board, int col, int row)
    {
        int startB = 0;
        int startW = 0;

        for(int i = col; i < col + 8; i++){
            for(int j = row; j < row + 8; j++){
                char val = board[i][j];

                if((i + j) % 2 == 0){
                    // 시작지점이 B인 경우 이 부분은 B가 나와야 함
                    // 만약 값이 W라면 startB를 카운트

                    // 시작지점이 W인 경우 이 부분은 W가 나와야 함
                    // 만약 값이 B라면 startW를 카운트

                    // B인 경우
                    if(val == 'B'){
                        startW++;
                    }
                    // W인 경우
                    else{
                        startB++;
                    }
                }else{
                    // 시작 지점이 B인 경우 이 부분은 W가 나와야 함
                    // 값이 B라면 startB를 카운트
                    if(val == 'B'){
                        startB++;
                    }
                    // 시작 지점이 W인 경우 이 부분은 B가 나와야 함
                    // 값이 w라면 startW를 카운트
                    else{
                        startW++;
                    }
                }
            }
        }

        return Math.min(startB, startW);
    }


}