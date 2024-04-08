import java.io.*;
import java.util.*;

public class Main {

    static String arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = br.readLine();

        int open = 0;
        int sum = 0;

        for (int i = 0; i < arr.length(); i++) {
            if(arr.charAt(i) == '(')
                open++;
            else
                sum += open;
        }

        System.out.println(sum);

    }// end of main

}// end of class