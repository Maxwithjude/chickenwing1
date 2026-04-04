public class Test1 {
    public static void main(String[] args) {
        int j, i;
        for(j=0, i=0; i<=5; i++){
            j+= i;
            System.out.println(i);
            if(i == 5){
                System.out.print("=");
                System.out.print(j);
            }else
                System.out.print("+");
        }
    }
    
}//위 값의 출력은 0+1+2+3+4+5= 15 이다 (시나공 실기 제어문)
