import java.io.*;
import java.util.*;

public class Main {

    static int N, K;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[N];
        func(0);
    }// end of main
    

    public static void func(int depth) {
        if(depth == N) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append(arr[i]).append(" ");
            }

            System.out.println(sb.toString());
            return;
        }

        for (int i = 1; i <= K; i++) {
            arr[depth] = i;
            func(depth + 1);
        }
    }// end of func

}// end