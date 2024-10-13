//leet 286 self Cyclic Sort
import java.util.Arrays;
public class Self_MissingNumberCyclicSort{
public static void main(String args[]){
//int[] ar={5,4,3,2,1,0};
//int[] ar={1,0};
//int[] ar={9,6,4,2,3,5,7,0,1};
//int[] ar={0,4,3,2,1};
int[] ar={0,2};
System.out.println("Array before Cyclic Sort "+Arrays.toString(ar));
System.out.println("Found Missing element -->> "+CyclicSort(ar));
System.out.println("Array After Cyclic Sort "+Arrays.toString(ar));


}
//main cyclicsort method

static int CyclicSort(int[] ar){
int i=0;
while(i<ar.length){
int correct=ar[i];
if(ar[i]<ar.length && ar[i]!=ar[correct]){

swap(ar,i,correct);

}else{
i++;
}
System.out.println("Array inside Cyclic Sort ------ "+Arrays.toString(ar));

}
//to found missing Number in an array (sorted)

//linear search
for(int j=0;j<ar.length;j++){
if(ar[j]!=j){
return j;
}
}

//if not found then returning the len of array
return ar.length;


}




//swapping of elements
static void swap(int[] ar,int first,int last){
System.out.println("first "+first+"  last "+last );

int temp=ar[first];
ar[first]=ar[last];
ar[last]=temp;




}




}