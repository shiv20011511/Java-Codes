//maximum and minimum element in an array
import java.util.*;
public class Maxmin{
public static void main(String args[]){
System.out.print("Enter the size of array : ");
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int[] arr=new int[size];
for(int i=0;i<size;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<size;i++){
System.out.print(arr[i]+" , ");
}
System.out.println();
for (int i=0;i<arr.length;i++){
for (int j=0;j<arr.length-1;j++){
if (arr[j]>arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
System.out.println("Mimum value "+arr[0]);
System.out.println("Maximum value "+arr[arr.length-1]);
}
}