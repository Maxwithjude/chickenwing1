import sys

n = int(sys.stdin.readline())

answer = 0

if n >= 23:
    answer = 3 * 3600 + (n - 2) * 1575

elif n < 23 and n >= 13:
    answer = 2 * 3600 + (n-1) * 1575

elif n < 13 and n >= 3:
    answer = 1 * 3600 + n * 1575

else:
    answer = n * 1575

sys.stdout.write(str(answer))