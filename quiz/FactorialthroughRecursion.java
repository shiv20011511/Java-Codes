//factorial of a given number using recursion
import java.util.Scanner;
class FactorialthroughRecursion{

//without recursion
static int factorial_iterative(int a){
int sum=1;
int z=a;
if (z==0 || z==1){
return 1;
}else{
for (int i=1;i<a+1;i++){
sum*=i;
}
}
return sum;

}

//with recursion
static int factorial_recursion(int z){
int sum=1;
if (z==0 || z==1){
return 1;
}else{
sum=z*factorial_recursion(z-1);	
}
return sum;
}


public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number to find factorial ");
int n=sc.nextInt();
//int sumIterative=factorial_iterative(n);
//System.out.println("without recursion "+sumIterative);
int sumRecursive=factorial_recursion(n);
System.out.println("with recursion "+sumRecursive);

}


}