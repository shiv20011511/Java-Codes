//conversion of kilometer to miles and miles to km
import java.util.Scanner;
public class Kmtomiles{
public static void main(String args[]){
System.out.print("Hello select your choice \n 1) Kilometer to miles conversion \n 2) Miles to kilometer conversion : ");
Scanner sc=new Scanner(System.in);
int choice=sc.nextInt();
System.out.println();
if (choice==1){
System.out.print("Enter Kilometer : ");
double km=sc.nextFloat();
double mil=km/1.609;
System.out.println();
System.out.print("Mile : "+mil);
}else if (choice==2){
System.out.print("Enter Miles : ");
double miles=sc.nextDouble();
double k=miles*1.609;
System.out.println();
System.out.print("kilometer : "+ k);
}else{
System.out.println("wrong choice ");
}

}
}