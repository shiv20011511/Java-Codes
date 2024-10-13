//Accenture Question Character Count

public class Accenture_Character_Count{

public static void main(String args[]){
String s="Helloworld";
char c='l';

System.out.println(Count_Charachter(s,c));

}

//function that count

static int Count_Charachter(String s,char c){
int count=0;

for(int i=0;i<s.length();i++){
if(s.charAt(i)==c){
count++;
}

}


return count;
}



}

