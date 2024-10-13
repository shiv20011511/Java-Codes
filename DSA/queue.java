 class queueoperation{
//use for deque
int front=0;
//use for enque
int rear=0;
int max=3;
//through array
int[] queue=new int[max];

void enqueue(int x)
{
if (rear==max){
System.out.println("Queue is overflow");
}else{
queue[rear]=x;
System.out.println(x+"----------- Insert in queue -----------");
//front++;
rear++;
}
}
void dequeue(){
if (front==rear){
System.out.println("Queue is underflow");
}else{
int v=queue[front];
System.out.println(v+"----------- delete in queue -----------");
//0 se hm use 1 
front++;
}
}
void peek(){
if (front==rear){
System.out.println("Queue is empty");
}else{
System.out.println(queue[front]+" Peeking the first element ");
}

}

void display(){
if (front==rear){
System.out.println("Queue is empty");
}else{
for(int i=front;i<rear;i++){
System.out.print(queue[i]+" ");
}
System.out.println();
}

}
}

class queue{
public static void main(String args[]){
queueoperation q=new queueoperation();
q.dequeue();
q.enqueue(30);
q.enqueue(40);
q.enqueue(50);
q.enqueue(60);
q.peek();
q.display();
q.dequeue();
q.peek();
q.dequeue();
q.dequeue();
q.dequeue();
q.display();
}
}