public class Test2 {
    public static void main(String[] args) {
        int a[] = new int[8];
        int i = 0;
        int n = 10;

        while((n > 0)){ //1번 괄호
            a[i++] = n % 2; //2번 괄호;
            n /= 2;
        }
        for(i = 7; i >= 0; i--){
            System.out.print(a[i]);
        }
    }
}
//위 코드는 n 에 저장된 10진수를 2진수로 변환하여 출력하는 프로그램 