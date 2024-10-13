import java.util.Scanner;
public class FactorialFunction{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
Factorial(n);
}

public static int Factorial(int n){
long fac=1;
if(n<0){
System.out.print("No negative numbers are allowed ");

}else if(n==0){
System.out.print(1);

}else {
for(int i=1;i<=n;i++){
fac*=i;
}
System.out.print("Your factorial of given number is : "+fac);
}
return 1;
}


}