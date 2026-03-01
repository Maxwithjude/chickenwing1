import sys

str1 = sys.stdin.readline().strip()

str2 = []
int1 = 0
for i in str1:
    if i.isalpha():
        str2.append(i)
    else:
        int1 += int(i)

str2.sort()

if int1 != 0:
    str2.append(str(int1))

sys.stdout.write(''.join(str2))