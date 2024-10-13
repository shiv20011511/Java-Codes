//tcs string matching question
import java.util.Scanner;
public class Tcs_q1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

String bob=sc.next();
String alice=sc.next();
if(bob.contains("#") || alice.contains("#")){
int bobvalue=bob.indexOf("#");
bob.charAt(bobvalue-1);
bob.replace(0," ");
bob.replace("#","");
System.out.println(bob);
System.out.println(alice.indexOf("#"));
}



}




}