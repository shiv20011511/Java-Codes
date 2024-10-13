//self Binary search in 2d array
import java.util.Arrays;
public class Matrix_Search_BS{
public static void main(String args[]){
int[][] arr={{-1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
//int[][] arr={{-1,3}};
//int target=13;
//int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
int target=10;

System.out.println("length of array "+arr.length);
System.out.println("0 row len "+arr[0].length);
System.out.println("Element Found ->-> "+Arrays.toString(Search(arr,target)));
}

static int[] Search(int[][] ar,int target){
int row=0;
int col=ar[row].length-1;
System.out.println("row ***** "+row);
System.out.println("col ******* "+col);
int count=0;
while(row<=ar.length-1 && col>=0){
//case 1
count++;
System.out.println("row ***** "+row);
System.out.println("col ******* "+col);

if(ar[row][col]==target){
System.out.println("Count "+count);
return new int[]{row,col};
}
//case 2
if(ar[row][col]<target){
row++;
}else{
col--;
}





}

return new int[]{-1,-1};
}





	




}