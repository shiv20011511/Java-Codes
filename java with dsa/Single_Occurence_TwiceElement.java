//Question to find the number that has single occurrence in array

import java.util.Arrays;

public class Single_Occurence_TwiceElement{
public static void main(String[] args){
int[] ar={2,3,4,1,2,1,3,6,4};

System.out.println("OG ARRAYN -->> "+Arrays.toString(ar));
//better approach
System.out.println(Using_BitManipulation_XOR(ar));

//Using_Brute_Force(ar);





}
//Better Approach By bit Manipulation (XOR)

static int Using_BitManipulation_XOR(int[] ar){
int unique=0;

for(int i:ar){

unique^=i;
System.out.println("XOR Unique -->> "+unique);
}


return unique;
}




//approach 1 by brute force
static int Using_Brute_Force(int[] ar){
int count=0;

for(int i=0;i<ar.length;i++){
for(int j=i+1;j<ar.length;j++){
if(ar[i]==ar[j]){
ar[i]=0;
ar[j]=0;

}


}



}

System.out.println(Arrays.toString(ar));

return -1;
}




}