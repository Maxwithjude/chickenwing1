# import sys
# from collections import deque

# queue = deque()

# queue.append(5)
# queue.popleft()

# print(queue)
# queue.reverse()
# print(queue)

# 리스트 자료형보다 덱을 사용하는게 시간복잡도가 좋음
# 리스트 사용시 원소를 빼고 원상복구 시키는 작업이 추가됨

import sys

def dfs(node, v, visited):
    visited[v] = True
    print(v, end='')

    for i in node[v]:
        if not visited[i]:
            dfs(node, i, visited)


node = [
    [],
    [2, 3, 8],
    [1, 7],
    [1, 4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1, 7]
]

visited = [False] * 9

dfs(node, 1, visited)