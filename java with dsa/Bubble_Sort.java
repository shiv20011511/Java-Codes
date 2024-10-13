//Bubble Sort
import java.util.Arrays;
public class Bubble_Sort{
public static void main(String args[]){
//int[] ar={3,2,4,5,1,10,20,100,-3};
//int[] ar={5,4,3,2,1};
//int[] ar={1,2,3,4,5};
int[] ar={2,1};
System.out.println("Array Before Bubble Sort -->>  "+Arrays.toString(ar));

BubbleSort(ar);
System.out.println("Array After Bubble Sort -->> "+Arrays.toString(ar));

}
//function that sorts Through Bubble sort
static void BubbleSort(int[] ar){
boolean swapped=false;
int len=ar.length;
int counter=0;
for(int i=0;i<len;i++){

for(int j=1;j<len-i;j++){

counter++;
//swapping the smaller elements
if(ar[j]<ar[j-1]){
int temp=ar[j];
ar[j]=ar[j-1];
ar[j-1]=temp;
swapped=true;
}
}

System.out.println("Inside Bubble Sort Array **********  "+Arrays.toString(ar));
//if no swap there means array is sorted

if(!swapped){
break;
}


}

System.out.println("---------Count is -----------"+counter);
}


}