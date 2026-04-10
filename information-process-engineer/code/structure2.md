#include <stdio.h>
struct jsu {
char nae[12];
int os, db, hab, hhab;
};

int main() {
struct jsu st[3] = { {"데이터1", 95, 88}, {"데이터2", 84, 91}, {"데이터3", 86, 73}};
struct jsu\* p;
p = &st[0];
(p+1)-> hab = (p+1) -> os + (p+2)-> db;

(p+1)-> hhab = (p+1) -> hab + p -> os + p -> db;
printf("%d", (p + 1)->hab + (p + 1)-> hhab);

}

# 풀이 (p+1) -> os = 84 p+2 -> db = 73 ===> p+1 -> hab = 157

p+1 -> hab = 157 + 95 + 88 = 340

157 + 340 = 497
