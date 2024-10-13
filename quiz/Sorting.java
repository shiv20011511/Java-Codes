public class Sorting{
public static void main(String args[]){
int temp=0;
int[] ar={19,18,17,16,22,44,55,1,2,55};

for(int i=0;i<ar.length;i++){
for(int j=0;j<ar.length-1;j++){
if(ar[j]>ar[j+1]){
temp=ar[j];
ar[j]=ar[j+1];
ar[j+1]=temp;
}

}
}

for(int i=0;i<ar.length;i++){
System.out.print(ar[i]+" ");
}


}

}