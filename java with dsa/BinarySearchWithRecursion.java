//Binary Search Implementing With Recursion 
import java.util.Arrays;

public class BinarySearchWithRecursion{
public static void main(String args[]){

int[] ar={1,2,3,4,5,6};
System.out.println("Array -- "+Arrays.toString(ar));
int target=2;

System.out.println("Element at Index -->> "+BinarySearch(ar,target,0,ar.length-1));

}

static int BinarySearch(int[] ar,int target,int start,int end){

//base condition for program Termination

if(start>end){
return -1;
}


int mid=start+(end-start)/2;

//base condition for element found
if(ar[mid]==target){
return mid;
}

if(ar[mid]>target){
return BinarySearch(ar,target,start,mid-1);
}

//below is else part(mid<target)


return  BinarySearch(ar,target,mid+1,end);




}


}
