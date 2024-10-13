//Selection Sort 
import java.util.Arrays;
public class Selection_Sort{
public static void main(String args[]){
//int[] ar={1,2,3,4,5};
int[] ar={3,4,43,121,21,435,77,-1,23213,44,11,22};
//int[] ar={5,4,3,2,1};
System.out.println("Before Selection Sort -->> "+Arrays.toString(ar));
SelectionSort(ar);
System.out.println("After Selection Sort -->> "+Arrays.toString(ar));
}
//function that perform selection sort by picking the largest element in an array
static void SelectionSort(int[] ar){
int len=ar.length;
//for maximum

for(int i=0;i<len;i++){
int last=len-i-1;
int max=getMax(ar,0,last);
swap(ar,max,last);
}

/*

//for small
for(int i=0;i<len;i++){
//int start=i;

int small=getSmall(ar,i,ar.length-1);

swap(ar,small,i);
//start++;
}
*/

}

//maximum function 
static int getMax(int[] ar,int start,int end){
int max=start;
//{5,4,3,2,1}  
for(int i=start;i<=end;i++){

if(ar[max]<ar[i]){
max=i;

}
System.out.println("Maximum -->> "+ar[max]);
}


return max;
}

//swap function
static void swap(int[] ar,int first,int second){
int temp=ar[first];
ar[first]=ar[second];
ar[second]=temp;

}

//function that find the smallest because we can do selection sort by picking smallest or largest 

static int getSmall(int[] ar,int start,int end){

System.out.println("start "+start+" end "+end);
int small=start;
for(int i=start;i<=end;i++){
if(ar[small]>ar[i]){
small=i;

}
System.out.println("Small "+ar[small]);
}

return small;
}


}