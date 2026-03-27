import sys
from collections import deque

n, m = map(int, sys.stdin.readline().split())
## 방문배열
visited = [[False] * m for _ in range(n)]

dx = [0, -1, 0, 1]
dy = [-1, 0, 1, 0]

arr = []
# 입력받기
arr = [list(map(int, sys.stdin.readline().strip())) for _ in range(n)]


def bfs(x, y):
    qu = deque()
    qu.append((x, y))
    visited[x][y] = True


    while qu:
        x, y = qu.popleft()
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            ## 범위 체크
            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if arr[nx][ny] == 1:
                continue
            
            if not visited[nx][ny]:
                qu.append((nx, ny))
                visited[nx][ny] = True

count = 0
for i in range(n):
    for j in range(m):
        if arr[i][j] == 0 and not visited[i][j]:
            count += 1
            bfs(i, j)

print(count)