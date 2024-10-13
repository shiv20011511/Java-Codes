class Arraytofindmax{
public static void main(String args[]){
int[] newarr={34,52,3,4,5,6,7,8,9,1};
int max=0;
int min=0;
for (int i=0;i<newarr.length-1;i++){
if (newarr[i]>newarr[i+1]){
max=newarr[i];
}
}
System.out.println(max);
int n=0000005;
String s=Integer.toString(n);
System.out.println("this int contains   "+s +" :: "+ n);
}
}