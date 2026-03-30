class Parent {
    int x = 10;
    void show() {
    System.out.println("Parent Show");
    }
    void print() {
    System.out.println("Parent Print");
    }
}

class Child extends Parent {
    int x = 20;
    void show() { // 오버라이딩
    System.out.println("Child Show");
    }
    void childMethod() {
    System.out.println("Child Only");
    }
}

public class Test {
    public static void main(String[] args) {
    Parent p = new Child(); // 다형성 활용 (업캐스팅)

            System.out.print(p.x + ", ");
            p.show();
            // p.childMethod(); // 컴파일 에러: Parent 타입에는 childMethod가 없음
        }

}
// 매개변수는 부모, 메서드는 오버라이딩 된게 있으니 자식