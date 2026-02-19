import sys

n = int(sys.stdin.readline())

x, y = 1, 1

plans = list(sys.stdin.readline().split())

# l, R, U, D
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

modula = ['L', 'R', 'U', 'D']

for plan in plans:
    nx = x
    ny = y
    for i in range(4):
        if(plan == modula[i]):
            nx = x + dx[i]
            ny = y + dy [i]

        if(nx < 1 or nx > n or ny < 1 or ny > n):
            continue

        x = nx
        y = ny

print(x, y)