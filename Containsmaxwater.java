import java.util.*;
public class Containsmaxwater{
public static void main(String args[]){
int[] height={1,8,6,2,5,4,8,3,7};
int[] max=new int[36];
int sum=0;
int count=0;
for (int i=0;i<9;i++){
for (int j=i+1;j<9;j++){
if (height[i]<=height[j]){
	sum=height[i]*(j-i);
	//System.out.print(max+" , ");
}
else{
	sum=height[j]*(j-i);
	//System.out.print(max+" , ");
}
max[count]=sum;
System.out.print(max[count]+" , ");
count++;
}
}
System.out.println();
System.out.print("Number of iterations "+count+" ");

}



}