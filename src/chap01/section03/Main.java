package chap01.section03;

import java.util.Stack;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Stack s = new Stack();

        for (int i =0; i<str.length(); i++){
            s.push(str.charAt(i));
        }
        while (s.isEmpty()){
            s.pop();
        }
        if (str == s.toString()){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
