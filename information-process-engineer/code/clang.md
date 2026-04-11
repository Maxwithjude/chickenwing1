#include <stdio.h>
#define SIZE 3
typedef struct {
int a[SIZE];
int front;
int rear;
} Queue;

void enq(Queue\* q, int val){
q->a[q->rear] = val;
q->rear = (q-> rear + 1) % SIZE;
}

int deq(Queue\* q){
int val = q-> a [q->front];
q->front = (q->front+1) % SIZE;
return val;
}

int main() {
Queue q = {{0}, 0, 0};
enq(&q, 1); enq(&q,2); deq(&q); enq(&q, 3);

    int first = deq(&q);
    int second = deq(&q);
    printf("%d 그리고 %d", first, second);

    return 0;

}
//원형큐에 관한 것
2, 3 enq와 deq 을 보면 된다. 주의 deq 함수는 말그대로 front에서 빼는것
