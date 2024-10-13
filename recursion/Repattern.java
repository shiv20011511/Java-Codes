//using recursion to print the pattern
import java.util.Scanner;

public class Repattern{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of Pattern");
int n=s.nextInt();

Repattern rp=new Repattern();
rp.Re(n);
rp.pos(n);

}

int pos(int n){
int x=1;
if (n>0){
//x=x+1;
pos(n-1);
for (int i=0;i<n;i++){
System.out.print("\u001b[31m"+"*");
}
System.out.println();
}

return n;


}




int Re(int n){
if (n==1){
return 1;

}else{
for (int i=1;i<n;i++){
System.out.print("\u001b[32m"+"*");



}
System.out.println();
}

return Re(n-1);
}




}