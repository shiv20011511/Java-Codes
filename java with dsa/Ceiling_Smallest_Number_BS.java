//Ceiling of a number

public class Ceiling_Smallest_Number_BS{
public static void main(String args[]){
//ascending sorted array
int[] arr={2,3,5,9,12,14,16,18};
int target=4;
System.out.println("Return ->-> "+Ceiling(arr,target));
}

//function returns ceiling number : which is >=target

static int Ceiling(int[] arr,int target){
int min=-1;
//base condition if ceiling is not possible
if(target>arr[arr.length-1]){
return min;
}
int start=0;
int end=arr.length-1;

while(start<=end){

int mid=start+(end-start)/2;


if(arr[mid]==target){
return arr[mid];
}
System.out.println("Mid -> "+arr[mid]);




if(target>arr[mid]){
start=mid+1;
min=arr[mid];




}else if(target<arr[mid]){
end=mid-1;
min=arr[mid];
}

}


return arr[start];
//no need to store the value in variable because star=end
//return min;

}



}