import sys
from collections import deque


n, m = map(int, sys.stdin.readline().split())

graph = []
graph = [list(map(int, sys.stdin.readline().strip())) for _ in range(n)]

dx = [0, -1, 0, 1]
dy = [-1, 0, 1, 0]

def bfs(x, y):
    qu = deque()
    qu.append((x, y))
  
    while qu:
        x, y = qu.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < m:
                if graph[nx][ny] == 1:
                    graph[nx][ny] = graph[x][y] + 1
                    qu.append((nx, ny))
                

bfs(0, 0)
print(graph[n-1][m-1])
