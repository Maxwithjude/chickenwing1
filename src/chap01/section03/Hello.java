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

/* 반복문 두번째 문제
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("반복할 만큼 첫째 줄에 숫자를 적어주세요. 두 정수를 입력하세요.");
    while(input.hasNextInt()) {
        int k = input.nextInt();

        for (int i = k; i > 0;){
            int a = input.nextInt();
            int b = input.nextInt();
            if (a > 0 && b < 10){

                System.out.println(a + b);

        }break;

        }



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
*/
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total_price = in.nextInt();
        int kind = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= kind; i++) {
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
 /*
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