import java.io.*;
import java.util.*;

public class Main{

    static int N;
    static int[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < N - 2; j++) {
                max = Math.max(max, getCoinCount(i, j));
            }
        }// end of for

        System.out.println(max);

    }// end of main

    public static int getCoinCount(int rs, int cs) {
        int cnt = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(map[rs+i][cs+j] == 1)
                    cnt++;
            }
        }
        return cnt;
    }

}// end of class