//to find binomail coefficient
import java.util.Scanner;
class BinomialCoefficient{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int r=s.nextInt();
System.out.println(Binomialcoeff(n,r));

}
public static long  Binomialcoeff(int n,int r){
//making two int type variables to store the factorial value of n and r
long nf=1;
long rf=1;


long x=n-r;
long xf=1;
//below loops to find factorial
for(int i=1;i<=n;i++){
nf*=i;
}
for(int i=1;i<=r;i++){
rf*=i;
}
for(int i=1;i<=x;i++){
xf*=i;
}
//main binomial variable

long binomialfinder =nf/(rf*xf);
return binomialfinder;



}


}