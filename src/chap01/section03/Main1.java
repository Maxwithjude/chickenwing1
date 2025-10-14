package chap01.section03;

import java.util.Scanner;

public class Main1 {
    static char [][] arr;
    static void drawStar(int x, int y, int n){
        if(n == 1){
            arr[x][y] = '*';
            return;
    }
        int div = n / 3;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == 1 && j == 1) continue;
                drawStar(x + i * div, y + j * div, div);
            }
        }
        }

    public static void main(String[] args){
        //n은 3의 제곱수
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new char[n][n];
        //일단 공백채우기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) arr[i][j] = ' ';
        }
        drawStar(0, 0, n);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.print(sb);

    }
}
