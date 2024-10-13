public class DSstack{
public static void main(String[] args){
stackop s=new stackop();
s.push(10);
s.push(20);
s.push(30);
s.push(40);
s.push(50);
s.push(60);
s.getsize();
s.display();
s.pop();
s.getsize();
s.display();
s.pop();
s.pop();
s.pop();
s.pop();
s.pop();
s.getsize();
s.display();
}
}
class stackop{
int top;
int max=5;
int[] stack=new int[max];
int currentsize=0;
stackop(){
top=-1;
}
//methods
//peek pop display push size
void peek(){
System.out.println("\u001b[30m"+stack[top]+" Peeking the last element ");

}

public void push(int x){
if (top==(max-1)){
System.out.println("Stack is overflow ");
}else{
stack[++top]=x;
System.out.println("\u001b[32m"+stack[top]+" Pushed the element ");
//top++;
currentsize++;
}
}

public void pop(){
if (top<0){
System.out.println("Stack is underflow");
}else{
System.out.println("\u001b[31m"+stack[top]+" Popped the element ");
top--;
currentsize--;
}
}
void display(){
if (top<0){
System.out.println("Stack is empty");
}else{
System.out.println("Elements in stack ");
for (int i=top;i>=0;i--){
System.out.print(stack[i]+" ");
}
System.out.println();
}
}
void getsize(){
if (currentsize==0){
System.out.println(-1+" Current size of the stack ");
}else{
System.out.println(this.currentsize+" Current size of the stack ");
}
}


}