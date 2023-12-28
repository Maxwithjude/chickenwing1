package chap01.section03;

/*import java.util.Stack;
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
}*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        if (a >= 90 && a <= 100){
            System.out.println("A");
        }
        if (a >= 80 && a <= 89){
            System.out.println("B");
        }
        if (a >= 70 && a <= 79){
            System.out.println("C");
        }
        if (a >= 60 && a <= 69){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}