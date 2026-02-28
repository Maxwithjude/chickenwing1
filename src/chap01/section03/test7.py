import sys

a, b = sys.stdin.readline().strip()

num_a = ord(a) - ord('a')
num_b = int(b) - 1
cnt = 0
dx = [-2, -2, -1, 1, 2, 2, 1, -1]
dy = [-1, 1, -2, -2, -1, 1, 2, 2]

for i in range(len(dx)):
    nx = num_a + dx[i]
    ny = num_b + dy[i]
    if(nx >= 0 and nx <= 7 and ny >= 0 and ny <= 7):
        cnt += 1

sys.stdout.write(str(cnt))