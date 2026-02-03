import sys

n, k = map(int, sys.stdin.readline().split())

cnt = 0

while(True):
    #1이면 멈춤
    if n == 1:
        break

    if n % k == 0:
        n //= k
        cnt += 1
    else :
        n -= 1
        cnt += 1

print(cnt)
    
    