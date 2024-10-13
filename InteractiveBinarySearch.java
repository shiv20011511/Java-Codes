//Binary Search understanding in easy way
import java.util.Arrays;	
public class InteractiveBinarySearch{
public static void main(String args[]){

int[] ar={2,4,6,8,9,10,11,450,980,1080};
int target=1080;
System.out.println("Original array ---->>  "+Arrays.toString(ar));
System.out.println("Target ----> "+target);

System.out.println(BinarySearch(ar,target));

}

static int BinarySearch(int[] ar,int target){
int start=0;
int end=ar.length-1;

while(start<=end){
int mid=start+(end-start)/2;
//System.out.println(ar[mid]);
display(ar,start,end,mid);

if(ar[mid]==target){
return mid;

}

if(ar[mid]>target){
end=mid-1;
}else{
start=mid+1;
}


}

return -1;
}

static void display(int[] ar,int start,int end,int mid){

for(int i=start;i<=end;i++){

System.out.print(ar[i]+"  ");


}
System.out.println("Mid Point is -->> "+"\u001b[32m"+ar[mid]+"\u001b[37m");




}



}