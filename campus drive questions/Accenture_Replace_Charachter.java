//Accenture Replace question 16 aug 2024

public class Accenture_Replace_Charachter{

public static void main(String[] args){

String s="apples";
char s1='a';
char s2='p';

System.out.println(Replace(s,s1,s2));

}

//simple logic
static String Replace(String s,char s1,char s2){

String res="";

for(int i=0;i<s.length();i++){

if(s.charAt(i)==s1){
res+=s2;

}else if(s.charAt(i)==s2){
res+=s1;
}else{
res+=s.charAt(i);

}

}


return res;
}



}