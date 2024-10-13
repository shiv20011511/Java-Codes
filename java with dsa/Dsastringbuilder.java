//String and string builder in java
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.StringBuilder;

public class Dsastringbuilder{
public static void main(String args[]){

//String a="Shiv";
//String b="Shiv";
//in comparison of above string it will give true because in heap memory ab objects are pointing in a Same string

//== checks the address whether .equal() method checks the value not address


//in below this type not utilize the String pool in heap memory
//String a= new String("Shiv");
//String b= new String("Shiv");

//System.out.println(a==b);


//prints the element at given index 
//String name="Shivkant Pandey";
//System.out.println(name.charAt(5));

//Pretty Printing
//till 2 digit decimal 

//float x=3.145f;
//System.out.printf("Formatted Number is -->> %.4f",x);

//System.out.printf("Value of Pie -->> %.17f",Math.PI);
System.out.println();

//System.out.printf("Hello My name is %s and Iam %d years old","Shivkant Pandey",22);

//operators

//it will give the addition of ascii value of characters
System.out.println('a'+'b');
//double "" used to concatenate Strings
System.out.println("a"+"b");

System.out.println("Gives the character at ascii value -->> "+(char)('a'+29));


//in below the integer concatenated with string that int will converted integer that call toString() method 
//System.out.println("a"+12);


//System.out.println("Shiv "+"Kant"+new ArrayList<>()+"Pandey");


//genrating a to z

System.out.println("A to Z Below ");

String series="";


//for capital ascii starts at 65 and for small 97
for(int i=0;i<26;i++){
char ch=(char)('A'+i);
//System.out.println('A'+i);
//System.out.print(" , "+ch);
series+=ch+" ";

}
//System.out.println((char)('A'+1));
System.out.println(series);

//but in above code series+= in every iteration series will copy the previous string +new one in loop and making new object and then initialise in string that leads to so much time and memory consumption O(N^2) To tackle this we have a String Builder

StringBuilder sb=new StringBuilder();
for(int i=0;i<26;i++){
char ch=(char)('A'+i);
sb.append(ch);
}

System.out.println("String Builder -->> "+sb);
System.out.println(sb.toString());

//System.out.println("  shiv   ".strip());
System.out.println("  shiv   ".trim());
String names="Shiv Kant Pandey";
System.out.println(Arrays.toString(names.split(" ")));

String pallin="woww";


System.out.println("String is Pallindrome -->> "+Pallindrome(pallin));


}

static boolean Pallindrome(String str){
str=str.toLowerCase();

for(int i=0;i<=str.length()/2;i++){
char start=str.charAt(i);
char end=str.charAt(str.length()-1-i);

if(start!=end){
return false;
}

}

return true;

}



}