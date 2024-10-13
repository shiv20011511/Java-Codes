//2 d Array 
import java.util.Scanner;
import java.util.Arrays;
public class TwoD_Array{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println();
System.out.print("Enter No of Rows -> ");
int row=sc.nextInt();
System.out.println();
System.out.print("Enter No of Columns -> ");
int col=sc.nextInt();
System.out.println();
int[][] twod=new int[row][col];


//Input


for(int i=0;i<twod.length;i++){
for(int j=0;j<twod[i].length;j++){
twod[i][j]=sc.nextInt();

}
System.out.println();


}
//output

for(int i=0;i<twod.length;i++){
for(int j=0;j<twod[i].length;j++){
System.out.print(twod[i][j]+" ");

}
System.out.println();

}

//output with for each
System.out.println("output with for each");

for(int[] a: twod){
System.out.println(Arrays.toString(a));
}

System.out.println("Jagged Array (With no fixed column ) ");

//jagged array

int[][] arr={
{1,2,3,4,5,6,7,8,9},
{10,20,30},
{1000,2000,3000,4000,5000},
{01,10,11,00,110}
};

for(int rows=0;rows<arr.length;rows++){
for(int cols=0;cols<arr[rows].length;cols++){
System.out.print(arr[rows][cols]+" ");
}
System.out.println();
}






}




}