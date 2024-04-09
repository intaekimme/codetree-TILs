import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        map = new int[n][n];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                max = Math.max(max, map[i][j] + map[i][j + 1] + map[i][j + 2]);
            }
        }

        System.out.println(max);

    }// end of main

}// end of class