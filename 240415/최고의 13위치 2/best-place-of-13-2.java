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

        int max = Integer.MIN_VALUE;
        int cnt = 0;
        int[][] overlap;
        
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n - 2; j++) {
            here: for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n - 2; l++) {
                        cnt = 0;

                        overlap = new int[n][n];
                        overlap[i][j] = overlap[i][j+1] = overlap[i][j+2] = 1;

                        overlap[k][l] += 1;
                        overlap[k][l+1] += 1;
                        overlap[k][l+2] += 1;

                        if(overlap[k][l] > 1 || overlap[k][l+1] > 1 || overlap[k][l+2] > 1)
                            break here;
                        
                        cnt += map[i][j] + map[i][j+1] + map[i][j+2] + map[k][l] + map[k][l+1] + map[k][l+2];
                        max = Math.max(max, cnt);
                    }
                }
            }
        }

        System.out.println(max);

    }
}