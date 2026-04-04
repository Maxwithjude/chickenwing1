#include <stdio.h>
int main() {
int a[4] = { 0, 2, 4, 8};
int b[3];
int\* p;
int sum = 0;

    for ( int i = 1; i < 4; i++){
        p = a + i;
        b[i - 1] = *p - a[i - 1];
        sum = sum + b[i - 1] + a[i];
    }

    printf("%d", sum);

}
// 포인터형 변수 p 선언
p = a + i => i는 1일 때 a[1] 의 주소값 1004 byte 저장
a[0] 은 1000, a[1] 은 1004 각 4 byte
b[0] = p의 주소값이 가르키는 2 - a[0] = 2
