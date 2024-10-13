//Reverse a Number (KK)
public class Reverse{
public static void main(String args[]){
int num=6534754;
int org=num;
int reverse=0;

while(num>0){  //condition
int rem=num%10; //last digit fetching 
//System.out.println(rem);
reverse=reverse*10+rem;

num=num/10;
//System.out.println(num);
}
System.out.println("Original Number "+"\u001b[31m"+org);
System.out.println("Reverse Number "+"\u001b[32m"+reverse);
System.out.println("\u001b[37m");

}


}