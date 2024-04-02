import java.io.*;
import java.util.*;

public class Main {

    static boolean[] arr = new boolean[31];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 28; i++) {
            arr[Integer.parseInt(br.readLine())] = true;
        }

        int min = -1;
        for (int i = 1 ; i <= 30; i++) {
            if(min == -1 && !arr[i]){
                min = i;
                continue;
            }
            if(min > 0 && !arr[i]) {
                min = i > min ? min : i;
                System.out.println(min);
                System.out.println(i);
                break;
            }
        }
    }// end of main

}// end of class