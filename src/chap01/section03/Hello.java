package chap01.section03;

import org.w3c.dom.*;

import javax.swing.*;
import java.io.*;
import java.time.Year;
import java.util.*;

/*
public class Hello {
    public static void main(String[] args) {
       int age = 17;
       int salary = 5000;

       System.out.println(age);
       System.out.println(age + salary);
    }
}


public class Hello {
    public static void main(String[] args) {
        int A = 1;
        int B = 2;

        System.out.println(A+B);
    }
}

public class Hello {
    public static void main(String[] args) {
        int A = 7;
        int B = 3;
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
    }
}
*
public class Hello {
    public static void main(String[] args) {
        char A = ("joonas");

    }
   #입출력과 사칙연산 9번 문제
public class Hello {
    public static void main(String[] args) {
        int A = 5;
        int B = 8;
        int C = 4;

        System.out.println((A + B) % C);
        System.out.println((A % C) + (B % C) % C);
        System.out.println((A * B) % C);
        System.out.println((A % C) * (B % C) % C);
    }
}
#태국 문제

public class Hello {
    public static void main(String[] args) {
        int A = 2541;
        int B = 0;

        while (1000 <= A && A <= 3000) {
            B = A - 543;
            A++;
        }
        System.out.println(B);
    }
}

#2장 조건문 백준 문제 1번
  오 그럴듯 해보이는 거 성공 소확행!
public class Hello {
    public static void main(String[] args) {
        int A = 5;
        int B = 5;
        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
 2번 시험 성적 문제 두 번째 완전한 정답!
public class Hello {
    public static void main(String[] args) {
        int grade = 49;
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
    }
     첫 번째 조건문에서 !==을 쳐버렸다 !=이 맞음
public class Hello {
    public static void main(String[] args) {
        int A = 1999;
        if (A % 4 == 0 && A % 100 != 0) {
            System.out.println(1);
        }
        if (A % 4 == 0 && A % 400 == 0) {
            System.out.println(1);
        }
        else
            System.out.println(0);
        }
    }

2023-08-09

2023-08-10
*/
/*
public class Hello {

    public static void main(String[] args) {
        int result = 0;
        for (int i=1; i<=30; i++) {
            if(i % 3 == 0) {
                result += i;
                if(i >= 20) {
                    break;
                }
                if(i == 15) {
                    continue;
                }

            }
        }
        System.out.println(result);
    }
}
*/ // 백준 4사분면 문제 풀이 (정답)
/*
public class Hello {
    public static void main(String[] args) {
        int A = 9;
        int B = -13;
        if (A >= 0 && B >= 0){
            System.out.println(1);
    } else if(A >=0&&B <=0) {
        System.out.println(4);
    } else if(A <=0&&B >=0) {
        System.out.println(2);
    } else if(A >=0&&B <=0) {
        System.out.println(3);
    }
}
}

public class Hello {
    public static void main(String[] args) {
        int H = 23;
        int M = 40;

        M -= 45;

      if (M < 0){
          H -= 1;
          M += 60;
      }

      if (H < 0){
          H += 24;
      }
System.out.println(H + " " + M);
    }

    }
 백준 단계별 오븐시계_2525번
public class Hello {
    public static void main(String[] args) {
      int H = 23;
      int M = 48;
      int C = 25;

        int total_minute = H * 60 + M + C;
        int F = total_minute/60;
        int FM = total_minute%60;
      if(F >= 24){
          F -= 24;
      }
        System.out.println(F + " " + FM);
      }
    }
백준 단계별로 풀어보기 IF 2480번

public class Hello {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        int c = 5;
        int midterm= Math.max(a,b);
        int x= Math.max(midterm, c);

        if (a == b && b == c){
            System.out.println(10000+a*1000);
        } else if (a == b || a == c) {
            System.out.println(1000+b*100);
        } else if (b == c) {
            System.out.println(1000+a*100);
        } else {
            System.out.println(x*100);

    }
    }
}
백준 단계별로 풀어보기 반복문 첫 문제
*/
/*
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        for (int i = 1; i < 10; i++){
            System.out.println(n + "*" + i + "=" + n*i );
        }

    }
}
*/
/*
반복문 두번째 문제
*/
/*
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int ary[] = new int[k];

        for (int i = 0; i < k; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            ary[i] = a + b;
        }
       input.close();
        for (int l : ary) {
            System.out.println(l);
        }
    }

}
*/
/*
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum += i;

        }System.out.println(sum);

    }
}
*/
/*
백준 반복문 4번째 영수증문제
밑의 문제는 나혼자 풀었는데 맞았다! 반복문에 자신감이 생겨가는 것 같으며
뿌듯하다!

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total_price = in.nextInt();
        int kind = in.nextInt();
        int sum = 0;

        for (int i = 0; i < kind; i++) {
            int cheap = in.nextInt();
            int count = in.nextInt();
            sum += cheap * count;
        }
        if (total_price == sum) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }
}

import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
*/
/*
import java.util.Scanner;

public class Hello{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n >= 4 && n <= 1000 && n % 4 == 0){
            int k = n / 4;
            for (int y = 0; y < k; y++){
                System.out.println("long");



            }
            System.out.println("int");
        }else {
            System.out.println("잘 못 입력하였습니다.");
        }
    }
}

*/
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Hello {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(a + b +"\n");

        }
        bw.flush();
    }
}

*/
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Hello{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": ");
            bw.write(  a + b +"\n");
        }bw.flush();
    }
}
*/
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Hello{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case " + "#" + i + ": ");
            bw.write(a  + " + " +  b + " = " + (a + b) +"\n");
        }bw.flush();
    }
}
*/
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hello{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int k = N / 4;
        for (int i = 0; i < k; i++) {
            bw.write("long ");


        }bw.write("int");
        bw.flush();


    }
}
*/
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Hello{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }bw.write(" " + "\n");



        } bw.flush();

    }
}
*/
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Hello{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += i;

        }bw.write(sum);
        bw.flush();



    }
}
*/
/*
import java.io.BufferedReader;
        import java.io.BufferedWriter;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.io.OutputStreamWriter;
        import java.util.StringTokenizer;


public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i; j++){
                bw.write(" ");

            }
            for (int k = 0; k <= i; k++) {
                bw.write("*");
            }bw.newLine();

        }bw.flush();
    }
}
*/
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (n == 0 && b == 0) {
                break;
            }
                bw.write((n + b) + "\n");
            }
            bw.flush();
        }
    }
*/
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Hello{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 0; i < n; i++){
            for (int k = 0; k < n - i; k++){

                bw.write(" ");

            }for (int j = 0; j <= i; j++ ){

                bw.write("*");

            }bw.newLine();
        }bw.flush();


    }
}
*/
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        StringTokenizer st;

        while ((str = br.readLine()) != null){

            st = new StringTokenizer(str, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(Integer.toString(a+b) + "\n");
        }bw.flush();
    }
}
*/
/*자바 백준 배열문제
*/
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int ary[] = new int[N];
        int V = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            ary[i] = Integer.parseInt(st.nextToken());
            if (ary[i] == V)
                count += 1;
        }
            System.out.println(count);

        }
    }
*/
/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Hello{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];
        StringTokenizer num = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(num.nextToken());
            if(arr[i] < X){
                bw.write(arr[i]+" ");
            }bw.flush();
        }


    }
}*/
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int arr[] = new int [N];

        for (int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        Arrays.sort(arr);
        bw.write(arr[0] + " " + arr[N-1]);
        bw.flush();
    }

}
*/
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arr[] = new int[9];

        int max = 0;
        int maxindex = -1;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
                maxindex = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(maxindex);

    }
}
*/
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];

        for(int z = 0; z < M; z++){
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st1.nextToken());
            int j = Integer.parseInt(st1.nextToken());
            int k = Integer.parseInt(st1.nextToken());
            for (int y = i - 1; y < j; y++) {
                arr[y] = k;
            }
        }for (int t = 0; t < N; t++){
            bw.write(arr[t] + " ");
            bw.flush();
        }
    }
}
*/
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        for (int k = 0; k < N; k++) {
            arr[k] = k + 1;
        }
        for (int z = 0; z < M; z++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st1.nextToken());
            int j = Integer.parseInt(st1.nextToken());
            int c = arr[i - 1];

            arr[i - 1] = arr[j-1];
            arr[j - 1] = c;

        }for (int q = 0; q < N; q++) {
            bw.write(arr[q] + " ");
            bw.flush();
        }
        }
    }
*/
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] check = new boolean[31];
        for (int i = 1; i < 29; i++){
            int t = Integer.parseInt(br.readLine());
            check [t] = true;

        }
        for (int i = 1; i <=30; i++){
            if (!check[i]) {
                System.out.println(i);
            }
        }


    }
}*/
/*import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
public class Hello{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 31; i++){
            list.add(i);
        }

        for (int i = 1; i < 29; i++){
            int k = Integer.parseInt(br.readLine());
            list.remove(Integer.valueOf(k));
        }
        System.out.println(list.get(0));
        System.out.println(list.get(1));



    }
}*/
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
public class Hello {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < 10; i++){
            h.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.println(h.size());
    }
}*/
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Hello{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++){
            arr[i] = i + 1;
        }

        for (int o = 0; o < M; o++){
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st1.nextToken()) - 1;
            int j = Integer.parseInt(st1.nextToken()) - 1;
            while (i < j) {
                int k = arr[i];
                arr[i++] = arr[j];
                arr[j--] = k;
            }
        }
        for (int q = 0; q < arr.length - 1; q++){
            System.out.println(arr[q] + " ");
        }
        System.out.println(arr[arr.length -1]);

    }
}
배열 마지막 문제
*/
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Hello{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double arr[] = new double[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i < arr.length; i++) {

            arr[i] = Double.parseDouble(st.nextToken());
        }
        double max = 0;
        Arrays.sort(arr);

        for (int k = 0; k<arr.length; k++) {
             max += arr[k] / arr[arr.length-1] * 100;
        }
        System.out.println(max / arr.length);
        }

}*/
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Hello{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());
        System.out.println(s.substring(i-1, i));


    }
}*/
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hello{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(s.length());
    }
}
*/

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hello {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = new String[Integer.parseInt(br.readLine())];
        for (int i =0; i < arr.length; i++) {
            String s = br.readLine();
            arr[i] = s.substring(0,1) + s.substring(s.length()-1, s.length());
        }
        for (int k =0; k <arr.length; k++){
            System.out.println(arr[k]);
        }
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Hello {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a, b, c;


         a = (st.nextToken());
         b = long.parselong(st.nextToken());
         c = long.parselong(st.nextToken());

        System.out.println(a + b + c);
    }
}
*/
/*
import java.io.IOException;

 public class Hello{
     public static void main(String[] args) throws IOException{
         int a = System.in.read();
         System.out.println(a);
     }
 }*/
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hello {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int sum = 0;
        for (byte value : br.readLine().getBytes()){
            sum += (value - '0');


        }
        System.out.println(sum);
    }
}*/
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hello {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr= new int[26];

        for (int i =0; i < arr.length; i++){
            arr[i] = -1;
        }
        String str = br.readLine();

        for (int i =0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (arr[ch - 'a'] == -1){
                arr[ch - 'a'] = i;
            }
        }
        for (int val : arr){
            System.out.println(val + " ");
        }


    }
}*/
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Hello {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i< T; i++) {

            String[] str = br.readLine().split(" ");
            int R = Integer.parseInt(str[0]);

            for (byte val : str[1].getBytes()){
                for (int j = 0; j <R; j++){
                    sb.append((char)val);
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}*/
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Hello {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());


    }
}*/

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Hello {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(a > b ? a:b);


    }
}
*/
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Hello {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count = 0;
        int k = s.length();

        for (int i = 0; i < k; i++){

            switch (s.charAt(i)){
                case 'A' : case 'B' : case 'C' :
                    count += 3;
                    break;

                case 'D' : case 'E' : case 'F' :
                    count += 4;
                    break;

                case 'G' : case 'H' : case 'I' :
                    count += 5;
                    break;

                case 'J' : case 'K' : case 'L' :
                    count += 6;
                    break;

                case 'M' : case 'N' : case 'O' :
                    count += 7;
                    break;

                case 'P' : case 'Q' : case 'R' : case 'S' :
                    count += 8;
                    break;

                case 'T' : case 'U' : case 'V' :
                    count += 9;
                    break;

                case 'W' : case 'X' : case 'Y' : case 'Z' :
                    count += 10;
                    break;
            }
        } System.out.println(count);

    }
}
*/

/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Hello {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String s = br.readLine();

            if (s == null){
                break;
            }
            else {
                System.out.println(s);
            }
        }
    }
}*/
/*
public class Hello {
    public static void main(String[] args){
        System.out.println("         ,r'\"7\n"
                +"r`-_   ,'  ,/\n"
                +" \\. \". L_r'\n"
                +"   `~\\/\n"
                +"      |\n"
                +"      |\n");

    }
}
*/

/*
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hello{
    public static void main(String [] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        king = king - Integer.parseInt(st.nextToken());
        queen = queen - Integer.parseInt(st.nextToken());
        rook = rook - Integer.parseInt(st.nextToken());
        bishop = bishop - Integer.parseInt(st.nextToken());
        knight = knight - Integer.parseInt(st.nextToken());
        pawn = pawn - Integer.parseInt(st.nextToken());

        System.out.println(king + " ");
        System.out.println(queen + " ");
        System.out.println(rook + " ");
        System.out.println(bishop + " ");
        System.out.println(knight + " ");
        System.out.println(pawn + " ");

    }
}

*/
/*import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        br.close();
        for (int i = 1; i < n*2; i++){
            int abs = Math.abs(n - i);
            bw.write(" ".repeat(abs) + "*".repeat((n - abs) * 2 -1) + "\n");
        }bw.flush();
    }
}*/
/*import java.util.Stack;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hello{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        Stack<Character> s = new Stack<Character>();

        for (int i =0; i<text.length(); i++) {
            s.push(text.charAt(i));
        }
        String text2 = "";

        while (s.size() > 0){
            text2 += s.pop();
        }
        if (text.equals(text2)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}*/
/*
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Hello {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}*/
/*
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String a = br.readLine().toUpperCase();
        int[] count = new int[26];
        int max = 0;
        char answer = 0;

        for (int i = 0; i<a.length(); i++){
            count[a.charAt(i)-'A']++;
        }

        for (int i = 0; i < count.length; i++){
            if (max < count[i]){
                max = count[i];
                answer=(char) (i+'A');
            } else if (max==count[i]) {
                answer = '?';

            }
        }
        System.out.println(answer);
        br.close();
    }
}

*/

/*
import java.io.IOException;
        import java.io.BufferedReader;
        import java.io.InputStreamReader;

public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String str[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i =0; i<str.length; i++){
            if (a.contains(str[i])){
                a = a.replace(str[i], "!");
            }
        }
        System.out.println(a.length());

    }
}
*/

/*import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] word = new String[n];
        int num = n;

        for (int i = 0 ; i < n; i++){
            word[i] = br.readLine();
            boolean[] alp = new boolean[26];

            for (int j = 1; j < word[i].length(); j++){
                if (word[i].charAt(j)!= word[i].charAt(j-1)){
                    if (alp[word[i].charAt(j)-'a']){
                        num--;
                        break;
                    }
                    alp[word[i].charAt(j-1)-'a'] = true;
                }
            }
        }
        System.out.println(num);
        br.close();

    }
}*/

/*
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Double result = 0.0;
        Double arr[][] = new Double[20][2];
        Double total = 0.0;

        for (int i = 0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            arr[i][0] = Double.parseDouble(st.nextToken());
            String ch = st.nextToken();

            switch (ch.charAt(0)){
                case 'A' :
                    arr[i][1] = 4.0;
                    break;
                case 'B' :
                    arr[i][1]= 3.0;
                    break;
                case 'C' :
                    arr[i][1] = 2.0;
                    break;
                case 'D' :
                    arr[i][1]=1.0;
                    break;
                case 'F' :
                    arr[i][1]=0.0;
                case 'P' :
                    continue;
            }

            if (ch.charAt(0)!='F')
                if (ch.charAt(1)=='+')
                    arr[i][1]+=0.5;

            total+=arr[i][0];
            result+=arr[i][0]*arr[i][1];
        }
        System.out.println(result/=total);
    }
}*/
/*
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        for (int i = 0; i< N ; i++){
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < M; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i <N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for (int j =0; j < M; j++)
                sb.append(arr[i][j]+Integer.parseInt(st.nextToken())).append(" ");
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
*/

/*
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        int [][]arr = new int[9][9];


        for (int i =0; i < 9; i++){
            token = new StringTokenizer(br.readLine());

            for (int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(token.nextToken());
                  }
            }
        br.close();

        int max = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (max < arr[i][j]){
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max + "\n" + (x+1) + " " + (y+1) + " ");
    }
}*/
/*
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.String;
public class Hello {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String [][]arr = new String[5][15];

        for (int i =0; i < 5; i++){

        }


    }
}*/

/*
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hello{
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] arr = str.split(" ");

        int number = Integer.parseInt(arr[0]), su = Integer.parseInt(arr[1]);

        String answer = "";

        while (number != 0){
            int remainder = number % su;

            if (remainder < 10){
                answer += remainder;
            }

            else {
                answer += (char)(remainder + 55);
            }
            number /= su;
        }

        StringBuffer stringBuffer = new StringBuffer(answer);

        System.out.println(stringBuffer.reverse().toString());
    }
}*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int unit[] = {25, 10, 5, 1};
        int result[][] = new int[n][4];

        for (int i =0; i < n; i++){
            int input = Integer.parseInt(br.readLine());
            for (int j = 0; j < 4; j++){
                result[i][j] = input / unit[j];
                sb.append(result[i][j]).append(" ");
                input %= unit[j];
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}