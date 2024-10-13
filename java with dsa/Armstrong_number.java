//Armstrong numbers

import java.util.Scanner;


public class Armstrong_number{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

//System.out.println("Enter the Number to check Armstrong or not (3 digit )");

//int num=sc.nextInt();
//Armstrong(num);

//to print all three digit armstrong number

for(int i=100;i<1000;i++){
Armstrong(i);
}


}

static void Armstrong(int n){

int rem;
int sum=0;
int num=n;
int cube;

while(num > 0){

rem=num%10;

sum+=rem*rem*rem;
num=num/10;

}

if(sum==n){
System.out.println(sum+" Is a Armstrong number ");
}else{
//System.out.println(sum+" Is Not a Armstrong number ");


}

}



}