import sys
from collections import deque

dx = [0, 1, 0 ,-1]
dy = [-1, 0, 1, 0]

n, m = map(int, sys.stdin.readline().split())
visited = [[False] * m for _ in range(n)]

graph = []

graph = [list(map(int, sys.stdin.readline().strip())) for _ in range(n)]


def bfs(x, y):
    qu = deque()
    qu.append((x, y))

    visited[x][y] = True

    while qu:
        x, y = qu.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue
            if graph[nx][ny] == 1:
                continue

            if not visited[nx][ny]:
                visited[nx][ny] = True
                qu.append((nx, ny))

count = 0

for i in range(n):
    for j in range(m):
        if graph[i][j] == 0 and not visited[i][j]:
            bfs(i, j)
            count += 1
            #d인접부터
print(count)

