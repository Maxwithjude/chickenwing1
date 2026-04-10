class A {
    int a;
    int b;
}

public class poly {
    static void func1(A m){
        m.a *= 10;
    
    }
    static void func2(A m){
        m.a += m.b;
    }
    public static void main(String[] args) {
        A m = new A();
        m.a = 100;
        func1(m);
        m.b = m.a;
        func2(m);
        System.out.printf("%d", m.a);
    }
}

// 풀이 m.a 는 100인데 10 곱해서 넣으니 1000이고 func2 전에 m.bㄹ = 1000 넣었다. 