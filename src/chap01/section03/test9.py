import sys
from collections import deque

queue = deque()

queue.append(5)
queue.popleft()

print(queue)
queue.reverse()
print(queue)

# 리스트 자료형보다 덱을 사용하는게 시간복잡도가 좋음
# 리스트 사용시 원소를 빼고 원상복구 시키는 작업이 추가됨