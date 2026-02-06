import sys

n = int(sys.stdin.readline().strip())
arr = list(map(int, sys.stdin.readline().split()))

group_cnt = 0 # 그룹수
inner_cnt = 0

arr.sort()

for i in arr:
    inner_cnt += 1
    if(i <= inner_cnt):
        group_cnt += 1
        inner_cnt = 0

sys.stdout.write(str(group_cnt))


