import sys

st1 = sys.stdin.readline().strip()

arr = list(map(int, st1))

res = arr[0]

for x in range(1, len(arr)):
    if res <= 0 or arr[x] <= 1:
        res += arr[x]
    
    else:
        res *= arr[x]


print(res)

           

