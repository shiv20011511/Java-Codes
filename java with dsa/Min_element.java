//To found Minimum element in an array with documentation and base conditions


import java.util.Arrays;
public class Min_element{
public static void main(String args[]){
//creating an array
int[] arr={21,435,-78546875,-1,3,-14,55,66,777,88,-100,323,-560};
//int[] arr={1};
System.out.println("Length of an array is ->->-> "+arr.length);
System.out.println("Elements in Array is -> "+Arrays.toString(arr));

System.out.println("Minimum Value in an array is -> "+Minimum(arr));

}

//creating a function to check the minimum one
static int Minimum(int[] arr){
//creating an min variable and stroing 0
int min=0;




//base condtion
if(arr.length==0 || arr.length==-1 ){
return min;
}

//updating  the min variable from 0 to storing the 1 element of an array in it to validate
min=arr[0];

//looping to check

for(int i=1;i<arr.length;i++){
if(min>arr[i]){
min=arr[i];
}

}

//returning the minimum element 

return min;



}






}