//Accenture Question to Find The length of last word in String

public class Last_Word_Length_String{

public static void main(String args[]){
String s="fly to the moon";
System.out.println("String s = "+s);
System.out.println("length of last woord -->> "+Find_length(s));

}

static int Find_length(String s){
int n=s.length();
int count=0;
for(int i=0;i<n;i++){

if(s.charAt(i)==' '){
System.out.println("Count For each Word -->> "+count);

count=0;
}else{
count++;
}

}
System.out.println();
return count;
}





}