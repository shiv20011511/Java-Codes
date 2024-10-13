public class PracticeSet3{
public static void main(String args[]){
//problem 1
String name="SHIV";
String lower=name.toLowerCase();
System.out.println("Converted from upper to lower : "+lower);
//problem 2
String name1 ="My name is shiv ";
String withoutspaces=name1.replace(" ","_");
System.out.println("String with out spaces : "+withoutspaces);
//problem 3
String name2 ="Monu";
System.out.printf("Dear %s ,Thanks a lot ",name2);
System.out.println();
//problem4 
String name3="hi iam   double   spaced  to detect double or   triple  spaces";
System.out.println("double spaces at index "+ name3.indexOf("  ",name3.length()-1));
System.out.println("triple space at index "+name3.indexOf("   ",name3.length()-1));
//problem 5
System.out.println("Dear\tShiv,\tThis\tjava\tCourse\tis\tnice.\tThanks");
}
}