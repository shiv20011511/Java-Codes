//Removes Duplicates From String 

public class Remove_Duplicates_String{

public static void main(String args[]){

String s="geeksforgeeks";

Remove(s);

}

// function that returns

static void Remove(String s){

StringBuilder result = new StringBuilder();




for(int i=0;i<s.length();i++){
char c = s.charAt(i);
if(result.indexOf(String.valueOf(c))==-1){
result.append(c);
}


}


System.out.println("Output  -->> "+result);
}



}