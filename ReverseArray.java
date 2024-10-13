//Reversing the array 
public class ReverseArray{
public static void main(String args[]){
int[] arr={1,2,3,4,5,6,7,8,9};
int count=arr.length-1;
System.out.println("array");
for (int i=0;i<9;i++){
System.out.print(arr[i]+" ");
}
System.out.println();
System.out.println("reversed  array ");

for (int i=0;i<9;i++){
System.out.print(arr[count]+" ");
count--;
}


}
}