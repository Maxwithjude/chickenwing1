import sys
from collections import deque

def bfs(node, start, visited):
    queue = deque([start])
    visited[start] = True

    while queue:
        v = queue.popleft()
        print(v, end='')

        for i in node[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True

node = [
    [],
    [2, 3, 8],
    [1, 7],
    [4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1, 7]
]

visited = [False] * 9

bfs(node, 1, visited)