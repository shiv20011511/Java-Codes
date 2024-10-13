//checking string is palindrome or not with new logic
import java.util.List;
import java.util.ArrayList;

public class StringPallin{

public static void main(String args[]){
String s="aoooa";
System.out.println(Pallindrome(s));
String st="apples";
char old1='a';
char old2='p';
replacecharacters(st,old1,old2);

String sentence="Welcome to Hustler";

ReverseWordwise(sentence);


String ab="banana";
Replaceab(ab);



}



static Boolean Pallindrome(String s){
int start=0;
int end=s.length()-1;

while(start<end){
System.out.println("start -->> "+s.charAt(start));
System.out.println("last -->> "+s.charAt(end));


if(s.charAt(start)==s.charAt(end)){

start++;
end--;

}else{
return false;
}


}


return true;
}

//to replace characters in string 

static void replacecharacters(String st,char old1,char old2){

char[] result=st.toCharArray();

for(int i=0;i<result.length;i++){

if(result[i]==old1){

result[i]=old2;

}else if(result[i]==old2){

result[i]=old1;
}


}

System.out.println(result);

}

//reverse word wise

static void ReverseWordwise(String sent){
String result="";

List<String> stack=new ArrayList<>();

for(int i=0;i<sent.length();i++){

if(sent.charAt(i)==' '){
stack.add(result);
stack.add(" ");
result="";

}else{
result+=sent.charAt(i);

}


}

stack.add(result);

for(int i=stack.size()-1;i>=0;i--){
System.out.print(stack.get(i));
}
System.out.println();


}

//replace a with b

static void Replaceab(String s){

char[] sc=s.toCharArray();


for(int i=0;i<s.length();i++){

if(sc[i]=='a'){

sc[i]='b';


}


}



System.out.println(sc);
}




}