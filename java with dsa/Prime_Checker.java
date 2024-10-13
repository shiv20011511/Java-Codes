//prime number checker

import java.util.Scanner;

public class Prime_Checker{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter The Number To check Prime or Not (Should be greater than 1) -> ");
int num=sc.nextInt();
boolean ans=prime(num);

System.out.println();
System.out.println("The number "+num +" is a prime Number  " +ans);
}

static Boolean prime(int n){

//base condition
if(n<=1){
return false;
}



for(int i=2;i<n;i++){
if(n%i==0){
return false;

}

}
return true;

}




}