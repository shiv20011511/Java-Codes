//maximum element in an array
import java.util.Arrays;
import java.util.Scanner;

public class Max_Element{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the length of an array -> ");
int len=sc.nextInt();
int[] arr=new int[len];

for (int i=0;i<len;i++){
arr[i]=sc.nextInt();

} 
System.out.println();


System.out.println(Arrays.toString(arr));
System.out.println("Maximum value in an array is -> "+max_element(arr));

System.out.println("Maximum value in an array in range is -> "+max_element_range(arr,1,9));


//reversing the array
reverse(arr);

System.out.println("After Reversing the array ->->->->  "+Arrays.toString(arr));

}

static int max_element(int[] arr){
int max=arr[0];

for(int i=1;i<arr.length;i++){

if (arr[i]>max){
max=arr[i];
}
System.out.println(" MAXIMUM ->->->  "+max);
}

return max;

}

//in range

static int max_element_range(int[] arr,int start,int end){
int max=arr[start];

for(int i=start;i<end;i++){

if (arr[i]>max){
max=arr[i];
}
System.out.println(" MAXIMUM ->->->  "+max);
}

return max;

}


//reversing the array

static void reverse(int[] arr){
int start=0;
int end=arr.length-1;

for(int i=0;i<arr.length;i++){
//base condition
if(start>end){
break;
}

int temp=arr[end];
arr[end]=arr[start];
arr[start]=temp;
System.out.println("Start Value -> "+start);
System.out.println("End Value -> "+end);
start++;
end--;

}


}





}