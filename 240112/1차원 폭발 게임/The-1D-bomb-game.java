import java.io.*;
import java.util.*;

public class Main {

    static int N, M;

    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        while (M <= N) {
            // 방문 배열 생성
            visited = new boolean[N];

            // 연속된 M개 표시
            int pivot = arr[0]; // 연속된 숫자
            int p_idx = 0; // 연속된 숫자 최초 위치
            int bombCnt = 0; // 폭발해야될 수
            for (int i = 1; i < arr.length; i++) {
                // 확인한 원소가 연속한 숫자가 아니라면 갱신
                if (arr[i] != pivot) {
                    pivot = arr[i];
                    p_idx = i;
                    continue;
                }
                visited[p_idx] = true;
                visited[i] = true;
            }

            // 폭발해야될 수 계산
            for (int i = 0; i < arr.length; i++)
                bombCnt += visited[i] ? 1 : 0;

            int[] tmp = new int[arr.length - bombCnt];
            int tmpRow = 0;

            // 폭발 및 폭발 결과 기록
            for (int i = 0; i < arr.length; i++) {
                if (visited[i])
                    continue;
                tmp[tmpRow++] = arr[i];
            }

            arr = new int[arr.length - bombCnt];
            System.arraycopy(tmp, 0, arr, 0, arr.length);

            N = arr.length;
        } // end of while

        StringBuilder sb = new StringBuilder();
        sb.append(arr.length).append("\n");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb.toString());

    }// end of main

}// end of class