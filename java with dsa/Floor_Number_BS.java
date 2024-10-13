//Question floor of a number (opposite of ceiling  of a number) considering asc sorted array
public class Floor_Number_BS{
public static void main(String args[]){
int[] arr={2,3,5,9,14,16,18};
//int target=15;
int target=1;
System.out.println("Return ->->-> "+Floor(arr,target));

}
//function returns floor number : which is <=target
static int Floor(int[] arr,int target){
int start=0;
int end=arr.length-1;

//stores the value of smaller than target but larger among all smaller elements
int min=-1;

while(start<=end){

int mid=start+(end-start)/2;
//base condition if floor is not possible
if(target<arr[0]){
return min;
}


if(arr[mid]==target){
return arr[mid];
}

if(target>arr[mid]){
start=mid+1;
min=arr[mid];
if(min<arr[mid]){
min=arr[mid];
}


}else if(target<arr[mid]){
end=mid-1;



}



}



return min;
}


}