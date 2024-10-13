public class SumofArrays{
public static void main(String args[]){
int[] arr1={1,1,3,4,5,6,6,5,534,343,2,2,3,43,5,6,7,87,8,9,9,9,5,32,10,111,22};
int[] arr2={4,5,5,6,7,8,9,3,2,32,2,11,10,9,8,7,6,5,4};
SumofArrays s=new SumofArrays();
s.validate(arr1,arr2);
}

void validate(int[] a,int[] b){
int x=a.length;
int y=b.length;
System.out.println("length of arr1 "+x);
System.out.println("length of arr2 "+y);

int[] arr3=new int[x+y];
int count=0;
int temp=0;
int currentindex=0;
//array 1 
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if (a[i]==a[j]){
a[i]=-1;
}
}
}

System.out.println("the array 1 duplicate is now removed ");
for(int i=0;i<a.length;i++){
if(a[i]!=-1){
System.out.print(a[i]+" ");
arr3[count]=a[i];
count++;
}
}

//array 2

for(int i=0;i<b.length;i++){
for(int j=i+1;j<b.length;j++){
if (b[i]==b[j]){
b[i]=-1;
}
}
}
System.out.println();
System.out.println("the array 2 duplicate is now removed ");
for(int i=0;i<b.length;i++){
if(b[i]!=-1){
System.out.print(b[i]+" ");
arr3[count]=b[i];
count++;
}
}
System.out.println();

System.out.println("count value "+count);

//array 3
System.out.println("ARRAY 3");

for(int i=0;i<count;i++){
for(int j=i+1;j<count;j++){
if (arr3[i]==arr3[j]){
arr3[i]=-1;
}
}
}

for(int i=0;i<count;i++){
if(arr3[i]!=-1){
System.out.print(arr3[i]+" ");
}
}


}

}