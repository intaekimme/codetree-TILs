import java.io.*;
import java.util.*;

public class Main {

    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        
        int[] sort_list = new int[n];
        int[] pos = new int[n];
        String[] sort_str = new String[n];
        String[] buffer = new String[n];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            sort_list[i] = pos[i] = Integer.parseInt(st.nextToken());
            buffer[i] = st.nextToken();
        }

        Arrays.sort(sort_list);        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(sort_list[i] == pos[j])
                    sort_str[i] = buffer[j];
            }
        }
        // System.out.println(Arrays.toString(sort_list));
        // System.out.println(Arrays.toString(sort_str));

        int max = 0;

        int gCnt = 0;
        int hCnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                gCnt = 0;
                hCnt = 0;
                for (int k = i; k <= j; k++) {
                    if(sort_str[k].equals("G"))
                        gCnt++;
                    else
                        hCnt++;
                }

                if((gCnt > 1 && hCnt == 0) || (gCnt == 0 && hCnt > 1) || (gCnt != 0 && hCnt != 0 && gCnt == hCnt)){
                    // System.out.println(max);
                    // System.out.println(sort_list[i] + ", " + sort_list[j]);
                    // System.out.println(Math.abs(sort_list[j] - sort_list[i]));

                    max = Math.max(max, Math.abs(sort_list[j] - sort_list[i]));
                }

            }
        }

        System.out.println(max);

    }// end of main
}