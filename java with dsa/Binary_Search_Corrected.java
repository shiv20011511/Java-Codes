//This is the correct Binary Search algo

import java.util.Scanner;
import java.util.Arrays;
public class Binary_Search_Corrected{
public static void main(String args[]){
//int[] arr={60,70,80,90,100,120,200,300,400};

//making the data complex
/*
int[] arr=new int[20];
int asc=10;
for(int i=0;i<arr.length;i++){
arr[i]=asc;
asc+=5;
}
*/


int[] arr={100,95,80,85,75,65,55,54,44,24,12,13};

//for testing 

//int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};


System.out.println("Array Elements through for loop ->->-> "+Arrays.toString(arr));


int target=100;
System.out.println("Target ->->-> "+target);


//

//OrderAgnosticBinarySearch(arr,target);
System.out.println("Return ->->-> "+clean_code_of_OrderAgnosticBinarySearch(arr,target));


//System.out.println("Return ->->-> "+OrderAgnosticBinarySearch(arr,target));
}

//clean code
static int clean_code_of_OrderAgnosticBinarySearch(int[] arr,int target){

int value1=arr[0];
int value2=arr[arr.length-1];

boolean isAscending=value1<value2;
System.out.println("Boolean ascending check ->-> "+isAscending);
int start=0;
int end=arr.length-1;


while(start <=end){

int mid=start+(end-start)/2;

if(arr[mid]==target){
return mid;
}

//if true
if(isAscending){

System.out.println("->-> Ascending ");

if(target<arr[mid]){
end=mid-1;
}else if(target>arr[mid]){
start=mid+1;
}

}else {
System.out.println("->-> Descending ");
if(target<arr[mid]){
start=mid+1;
}else if(target>arr[mid]){
end=mid-1;
}
}
}

return -1;
}



//this below code is very long and messy above code is clean and easily understable
//this function check the array is ascending sorted or descending
static void OrderAgnosticBinarySearch(int[] arr,int target){
//stroing the value of arr 1 and last element to compare it
int value1=arr[0];
int value2=arr[arr.length-1];

if(value1<value2){
System.out.println("Arrays is in Ascending order");
System.out.println("Return ->->-> "+BinarySearchAsc(arr,target));

}else if(value1>value2){
System.out.println("Arrays is in Descending order");
System.out.println("Return ->->-> "+BinarySearchDesc(arr,target));
}
}


//function  for ascending
//returning the index if found else -1

static int BinarySearchAsc(int[] arr,int target){

//start and end of an array change in further processing according to target

int start=0;
int end=arr.length-1;

System.out.println("Start ->->-> "+start+" End ->->->"+end);

while(start<=end){


//int mid=(start+end)/2; this exceeds the integer value if the dataset is too large better way to write this

int mid=start+(end-start)/2;


System.out.println("mid ->->-> "+arr[mid]);

if(target==arr[mid]){
return mid;
}

if(target>arr[mid]){
start=mid+1;
}else if(target<arr[mid]){
end=mid-1;
//end=arr.length;
}
}

return -1;
}


//function for descending
static int BinarySearchDesc(int[] arr,int target){

//start and end of an array change in further processing according to target

int start=0;
int end=arr.length-1;

System.out.println("Start ->->-> "+start+" End ->->->"+end);

while(start<=end){


//int mid=(start+end)/2; this exceeds the integer value if the dataset is too large better way to write this

int mid=start+(end-start)/2;


System.out.println("mid ->->-> "+arr[mid]);

if(target==arr[mid]){
return mid;
}

if(target>arr[mid]){
end=mid-1;
}else if(target<arr[mid]){
start=mid+1;
//end=arr.length;
}
}

return -1;
}








}