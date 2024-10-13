//hackerank pallindrome string
public class Pallindromestring{
public static void main(String args[]){
String s="mom";
String rev="";
int count=s.length()-1;
System.out.println(count);
for (int i=0;i<s.length();i++){
rev+=s.charAt(count);
count=count-1;
}
if (s.equals(rev)){
System.out.println("it is pallindrome");
}else{
System.out.println("Not");
}
}
}