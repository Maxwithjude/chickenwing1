package chap01.section03;

import javax.swing.*;
import java.time.Year;
import java.util.Random;

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
            for (int y = i - 1; y < j; y++){
                arr[y] = k;
            }br.close();
        }for (int t = 0; t < N; t++){
            bw.write(arr[t] + " ");
            bw.flush();
        }
    }
}