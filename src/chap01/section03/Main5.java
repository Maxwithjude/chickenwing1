package chap01.section03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        //bottom up
        int [] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        int sum = 0;

        for(int i = 2; i <= n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

//        for(int i = 0; i < n; i++){
//            sum += arr[i];
//        }

        System.out.println(arr[n]);
    }
}
