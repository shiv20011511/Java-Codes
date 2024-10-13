//shell sort
import java.util.Arrays;
class Shell_sort{

public static void main(String args[]){
int[] ar={5,4,3,2,1};
int n=ar.length;
System.out.println("Original -> "+Arrays.toString(ar));
int[] res=shellsort(ar,n);
System.out.println(Arrays.toString(res));
}



static int[] shellsort(int[] a,int n){

for (int gap = n/2; gap > 0 ; gap=gap/2 ) {

for(int i=gap;i<n;i++){

int temp=a[i];
System.out.println("temp -> "+temp);
int j;
for(j=i;j>=gap && a[j-gap]>temp;j=j-gap){

a[j]=a[j-gap];

}
a[j]=temp;
System.out.println("a[j] -> "+a[j]+" j value"+j);
}

}
return a;

}


}
