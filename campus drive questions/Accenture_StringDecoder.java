//Accenture question String Decodeer

public class Accenture_StringDecoder{

public static void main(String[] args){

String s="111111110111110111111111111011111111111101111111111111110";

System.out.println(Decrypt(s));


}

static String Decrypt(String s){
int count=0;
String dec="";

String[] ar={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

for(int i=0;i<s.length();i++){

if(s.charAt(i)!='0'){
count++;
}else{
dec+=ar[count-1];
count=0;

}


}

if(count!=0){
dec+=ar[count-1];
}
return dec;
}


}