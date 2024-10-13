 import java.util.Scanner;


public class HackerBracket{
public static void main(String[] args){
Scanner s=new Scanner(System.in);

prob p=new prob();
while(s.hasNext()){
String ch=s.next();
p.push(ch);
p.display();
p.validate();

};
//implementing stack 


}}

class prob{
int top;
prob(){
top=-1;
}
int max=99;
char[] st=new char[max];
String ty;
int count=0;
int c1=0;
int c2=0;
int c3=0;
int cl1=0;
int cl2=0;
int cl3=0;
void push(String ch){
if (top==(max-1)){
System.out.println("Stack is full");
}else{
for(int i=0;i<ch.length();i++){
char val=ch.charAt(i);

 if (val=='{'){
st[++top]=val;
c1++;
count++;
}
else if(val=='('){
st[++top]=val;
c2++;
count++;
}else if(val=='['){
st[++top]=val;
c3++;
count++;
}
else if(val=='}'){
  
st[++top]=val;
if (c1==0){
cl1--;
}else{
cl1++;
}
count++;
}
else if(val==')'){  
st[++top]=val;
if (c2==0){
cl2=-8;
}else{
cl2++;
}
count++;
}else if(val==']'){  
st[++top]=val;
if (c3==0){
cl3--;
}else{
cl3++;
}
count++;
}

}
}
//System.out.print(count+"Count value");
}
void pop(){
System.out.println("POP"+top);
System.out.println("count"+count);
for (int i=0;i<=top;i++){
--top;
count--;
}
}

void validate(){

if (c1==0 && c2==0 && c3==cl3 && c1==cl1 && c2==0 && c3==0 && c1==0 && c2==cl2 && c3==cl3){
System.out.println("true");
}
else if (c1==cl1 && c2==cl2 && c3==cl3){
System.out.println("true");
}else{
System.out.println("false");
}

top=-1;

count=0;
c1=0;
c2=0;
c3=0;
cl1=0;
cl2=0;
cl3=0;


}

void display(){
if(top<0){
System.out.println("Stack is empty");
}else{
for (int i=top;i>=0;i--){
System.out.print(st[i]+" ");
}
}
System.out.println("Total count : "+count);
System.out.println("Opening { "+c1);
System.out.println("Opening ( "+c2);
System.out.println("Opening [ "+c3);
System.out.println("Closing } "+cl1);
System.out.println("Closing ) "+cl2);
System.out.println("Closing ] "+cl3);
}

}

