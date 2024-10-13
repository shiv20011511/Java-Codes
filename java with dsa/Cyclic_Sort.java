//Cycli sort Self value=index-1
import java.util.Arrays;
public class Cyclic_Sort{
public static void main(String args[]){
//int[] ar={5,4,3,2,1};
//int[] ar={10,9,8,7,6,5,4,3,2,1};
int[] ar={1,5,2,3,4};
//int[] ar={1,2,3,4,5};
//int[] ar={5,2,3,4,1};
//int[] ar={0,1};
//int[] ar={1,0,2};
//int[] ar={4,3,2,7,8,2,3,1};
System.out.println("Array Before Sorted  -->> "+Arrays.toString(ar));
CyclicSort(ar);
System.out.println("Array After Sorted  -->> "+Arrays.toString(ar));
}
//function of Cyclic Sort
static void CyclicSort(int[] ar){
int i=0;

while(i<ar.length){
int index=ar[i]-1;
if(ar[i]!=ar[index]){
swap(ar,i,index);
}else{
i++;
}

}
}

//swap
static void swap(int[] ar,int first,int last){
int temp=ar[first];
ar[first]=ar[last];
ar[last]=temp;

}

}