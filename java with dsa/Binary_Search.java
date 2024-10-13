//Binary Search Self try not accomplished (partial correct but no further midpoint found initial found only) it is using only while loop
import java.util.Arrays;
import java.util.Scanner;
public class Binary_Search{
public static void main(String args[]){
//array must be sorted before we pass array to binary search algo
Scanner sc=new Scanner(System.in);
System.out.println("\u001b[31m"+"This is Self try so please insert element in sorted way asc/desc "+"\u001b[37m ");
System.out.print("\u001b[35m"+"Enter the size of element ->-> "+"\u001b[37m");
System.out.println();
int len=sc.nextInt();
int[] sorted=new int[len];
System.out.print("\u001b[35m"+"Enter the elements ->-> "+"\u001b[37m");
for(int i=0;i<len;i++){
sorted[i]=sc.nextInt();
}
System.out.println();
System.out.print("\u001b[35m"+"Enter the element to find ->-> "+"\u001b[37m");
System.out.println();

int target=sc.nextInt();
System.out.println("\u001b[31m"+" Sorted Array ->-> "+Arrays.toString(sorted)+"\u001b[37m");
System.out.println("\u001b[36m"+"Target is ->-> "+target+"\u001b[37m");
System.out.println(BinarySearchAlgo(sorted,target));

}

static int BinarySearchAlgo(int[] arr,int target){
//creating mid point to partion of array into two halfs 
int n=arr.length;
int midpoint=n/2;
System.out.println("Midpoint index ->-> "+midpoint+" Midpoint Value ->-> "+arr[midpoint]);


//base condition (to check the midpoint first)
if(target==arr[midpoint]){
System.out.println("\u001b[32m"+" Target matched with Midpoint ->-> "+midpoint+"\u001b[37m");
return midpoint;
}

//we know that array is sorted and by help of midpoint we easily get the element if present by moving on half but there is problem of ascending or descending so we have to add more if condition to check the array is aceneding or not
//this condition check the array is acending if ascending then it will proceed further


if(arr[0]<arr[midpoint]){

System.out.println("\u001b[36m"+" Array is Ascending Sorted ->-> "+"\u001b[37m");

if(target>arr[midpoint]){

for(int i=midpoint;i<arr.length;i++){

if(target==arr[i]){
System.out.println("\u001b[33m"+" Target is Greater Than Midpoint ->-> "+arr[midpoint]+" Index of found element ->-> "+ i+"\u001b[37m");
return i;
}

}
}else if(target<arr[midpoint]){

for(int i=0;i<midpoint;i++){

if(target==arr[i]){
System.out.println("\u001b[34m"+" Target is Smaller Than Midpoint ->-> "+arr[midpoint]+" Index of found element ->-> "+ i+"\u001b[37m");
return i;
}

}
//below else if condition check the array is descending sorted and run accordingly
}

}else if(arr[0]>arr[midpoint]){

System.out.println("\u001b[36m"+" Array is Descending Sorted ->-> "+"\u001b[37m");

if(target<arr[midpoint]){

for(int i=midpoint;i<arr.length;i++){
if(target==arr[i]){
System.out.println("\u001b[33m"+" Target is Smaller Than Midpoint ->-> "+arr[midpoint]+" Index of found element ->-> "+ i+"\u001b[37m");
return i;
}

}

}else if(target>arr[midpoint]){
for(int i=0;i<midpoint;i++){
if(target==arr[i]){
System.out.println("\u001b[34m"+" Target is Greater Than Midpoint ->-> "+arr[midpoint]+" Index of found element ->-> "+ i+"\u001b[37m");
return i;
}



}
}

}


return -1;
}




}