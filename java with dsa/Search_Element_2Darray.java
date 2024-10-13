//Search in 2d array and to find maximum in 2d array

import java.util.Arrays;
public class Search_Element_2Darray{
public static void main(String args[]){
//creating an 2darray with 2*2 dimensions
//int[][] arr=new int[2][2];
/*
int[][] arr ={
{3,4,5},
{2,5,6}
};
*/

System.out.println("Min Value "+Integer.MIN_VALUE);

//jagged array
int[][] arr ={
{432,432,43,54435,54,332,21,3,34,4},
{32,4535,7,98,654,434,3243}
};


System.out.println("Length (row) of an 2d arrays is ->>->> "+arr.length);
display(arr);


System.out.println("Element  at [row , column ] ->>->> "+Arrays.toString(Search_In_2D(arr,4)));


System.out.println("Maximum Element in a 2 D Arrays is ->->->-> "+Maximum_2D(arr));


}


static int[] Search_In_2D(int[][] arr,int target){
//creating an arrays to store row and column and incrementing 1 to understand by normal people by default -1 if not found 
int[] indexes=new int[2];
indexes[0]=-1;
indexes[1]=-1;

//looping to check the target present or not

for(int i=0;i<arr.length;i++){
for(int j=0;j<arr[i].length;j++){
if(arr[i][j]==target){
indexes[0]=i+1;
indexes[1]=j+1;
//returning and breaking the loop if found
return indexes;
}

}

}

//returning and breaking if not found
return indexes;

}

//maximum find in 2 d array

static int Maximum_2D(int[][] arr){
int max=arr[0][0];

for(int i=0;i<arr.length;i++){
for(int j=0;j<arr[i].length;j++){
if(max<arr[i][j]){
max=arr[i][j];
}


}

}

return max;


}







static void display(int[][] arr){
//displaying a 2d Array
System.out.println("Elements in an arrays are :");
for(int i=0;i<arr.length;i++){
System.out.println(Arrays.toString(arr[i]));
}


}







}