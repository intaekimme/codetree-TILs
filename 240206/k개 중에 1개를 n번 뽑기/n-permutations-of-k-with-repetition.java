import java.io.*;
import java.util.*;

public class Main {

    static int K, N;

    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        func(0);
    }

    // idx자리에 수를 채우는 함수
    public static void func(int idx) {
        if (idx == N) {
            for (int i = 0; i < arr.size(); i++) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= K; i++) {
            arr.add(idx, i);
            func(idx + 1);
            arr.remove(idx);
        }
    }// end of func
}