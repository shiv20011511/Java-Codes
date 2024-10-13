//Linear Search in string 
import java.util.Arrays;
public class Linear_Search_String{
public static void main(String args[]){
String s="This is the String";
char target='h';

//to create a char array of string
System.out.println(Arrays.toString(s.toCharArray()));

System.out.println(LinearSearch(s,target));
System.out.println("Length of the string -> "+s.length());
//range
System.out.println(LinearSearchRange(s,target,0,1));


}

static String LinearSearch(String s,char target){


for(int i=0;i<s.length();i++){
if(target==s.charAt(i)){
String found="Found the String at "+i+" index";
return found;
}

}


return "Not Found";
}

//Search in range

static String LinearSearchRange(String s,char target,int start,int end){
if(start>end || end>s.length()){
return "Enter Valid range -> "+start+" "+end;
}


for(int i=start;i<end;i++){
if(target==s.charAt(i)){
String found="Found the String at "+i+" index in Range -> "+start+" "+end;
return found;
}

}


return "Not Found in Range -> "+start+" "+end;
}





}