//campusdrive return a string with oddEven according to index of an element
import java.util.Arrays;
public class ODDEven{
public static void main(String[] args){
int[] ar={1,2,3,4,5};

System.out.println(Arrays.toString(ar));

System.out.println(ODDEVEN(ar));

}

//function that returns
static String ODDEVEN(int[] ar){
String OE="";
for(int i=0;i<ar.length;i++){

if(ar[i]&1==0){
OE+="Odd";
}else{
OE+="Even";
}

}

return OE;
}


}