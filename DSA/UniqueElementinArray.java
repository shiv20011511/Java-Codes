//Find the element that appears once

import java.util.Arrays;

public class UniqueElementinArray{

public static void main(String args[]){

//int[] ar={1,1,2,5,5};
//int[] ar={1,2,1,2,3,3,2,4};
//int[] ar={2,2,3,2};
int[] ar={2,2,1,2};
//int[] ar={4,1,2,1,2};
System.out.println("Element Found --->> "+Unique(ar));



System.out.println("Unique Element -->> "+UsingXor(ar));
}


//using brute force not optimised


static int Unique(int[] ar){

int[] count=new int[ar.length];

for(int i=0;i<ar.length;i++){
for(int j=i+1;j<ar.length;j++){

if(ar[i]==ar[j]){

count[i]++;
count[j]++;
//System.out.println(ar[i]+" "+count);
}


}

if(count[i]==0){

return ar[i];
}



}





System.out.println(Arrays.toString(count));

return -1;

}



//for optimisation using xor (bitwise operator)

static int UsingXor(int[] ar){
int unique=0;
for(int i=0;i<ar.length;i++){



unique = unique | ar[i];

}

return unique;

}





}

