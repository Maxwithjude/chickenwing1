import sys
from collections import deque

def bfs(node, start, visited):
    # 시작
    queue = deque([start])
    # 1번 방문처리
    visited[start] = True
    #node 끝까지 다 돌기위해
    while queue:
        #1번 꺼내고 2. 2, 3, 8 꺼내고 
        v = queue.popleft()
        #출력
        print(v, end='')
        # 1과 연결된 노드 2, 3, 8
        for i in node[v]:
            if not visited[i]:
                #2,3,8 넣고
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