//chat gpt model mock 
import java.util.Arrays;
public class ChatGPT_Question{
public static void main(String args[]){

//int[] ar={2, 7, 11, 15};
int[] ar={2, 7, 11, 15};
int target=18;

System.out.println(Arrays.toString(twosum(ar,target)));

}

//target to matched

static int[] twosum(int[] ar,int target){

for(int i=0;i<ar.length-1;i++){
for(int j=i+1;j<ar.length;j++){
if(ar[i]+ar[j]==target){
return new int[]{ar[i],ar[j]};

}

}


}
return new int[]{-1,-1};

}

//checking of pallindrome





}