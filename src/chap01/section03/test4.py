import sys

n = int(sys.stdin.readline())

#배열 선언 
answer = [1, 1]

list1 = list(sys.stdin.readline().split())


for i in list1:
    if i == 'R' and answer[1] + 1 <= n: 
        answer[1] += 1
    
    elif i == 'L' and answer[1] - 1 >= 1:
        answer[1] -= 1
    
    elif i == 'U' and answer[0] - 1 >= 1:
        answer[0] -= 1
    elif i == 'D' and answer[0] + 1 <= n:
        answer[0] += 1
    
    else:
        continue


print(answer[0], answer[1])