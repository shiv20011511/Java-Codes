import java.util.Scanner;
public class Autostack{
public static void main(String[] args){


System.out.println("Enter the Size of the Stack ");
Autostackop as=new Autostackop();
int max=0;
Scanner s=new Scanner(System.in);
System.out.println("Automate Stack implement and operations");
while (true){
System.out.println("Select the operations \n 1)PUSH 2)POP 3)DISPLAY 4)PEEK 5)EXIT");
int choice=s.nextInt();
if (choice==1){
System.out.println("How many Values you want to enter ");
int val=s.nextInt();
for (int i=0;i<val;i++){
as.push(s.nextInt());
}
}else if(choice==2){
System.out.println("How many Values you want to Pop ");
int val=s.nextInt();
for (int i=0;i<val;i++){
as.pop();
}
}else if(choice==3){
as.display();
}else if(choice==4){
as.peek();
}
else{
System.out.println("Bye");
System.exit(0);
}}}}

//class in which our stack is implemented through array with its methods
class Autostackop{

int top;

Scanner ma=new Scanner(System.in);
int max=ma.nextInt();
//creating an array
int[] stack=new int[max];

int currentsize=0;
//constructor
Autostackop(){
top=-1;
}

//methods
//peek pop display push size

void peek(){
if(top==-1){
System.out.println("There is no element in stack ");
}else{
System.out.println(stack[top]+" Peeking the last element ");
}}

public void push(int x){
//base condition 
if (top==(max-1)){
System.out.println("Stack is overflow ");
}else{
//top preincrement
stack[++top]=x;
System.out.println(stack[top]+" Pushed the element ");
currentsize++;
}
}


public void pop(){

if (top<0){
System.out.println("Stack is underflow");
}else{
System.out.println(stack[top]+" Popped the element ");
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
}}}