import java.io.*;
import java.util.*;


public class Main {

    static int n;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            int subDist = 0;
            for (int j = 0; j < n; j++) {
                if(i == j) continue;
                subDist += Math.abs(i - j) * arr[j];
            }

            minDist = Math.min(minDist, subDist);
        }

        System.out.println(minDist);
    }// end of main

}// end of class