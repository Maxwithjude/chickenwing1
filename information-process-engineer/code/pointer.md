#include <stdio.h>
int len(char\* p);

int main() {
char* p1 = "2022";
char* p2 = "202207"
int a = len(p1);
int b = len(p2);
printf("%d", a + b);

}

int len(char* p) {
int r = 0;
while (*p != '\0'){
p++;
r++;

    }
    return r;

}

// 함수 이름으로 유추가능하지만 정의함수 len을 보면
2, 0, 2, 2, \0 이렇게 p1이 구성되어있고, p++이 있으므로 다음자리로 넘어간다
