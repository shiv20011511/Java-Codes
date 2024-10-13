//program to solve 0/1 knapsack problem using dynammic programming
//import java.lang.Math;
import java.util.Scanner;
public class Knapsack{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);


System.out.println("enter the size of profit & weight ");
int n=sc.nextInt();
int[] profit=new int[n+1];
profit[0]=0;
int[] weight=new int[n+1];
weight[0]=0;
System.out.println("enter the elements in profit ");
for(int i=1;i<=n;i++){

profit[i]=sc.nextInt();
}
System.out.println("enter the elements in weight ");
for(int i=1;i<=n;i++){

weight[i]=sc.nextInt();
}
System.out.println("enter the capacity  ");
int capacity=sc.nextInt();
//int n=4;
int[][] k=new int[n+1][capacity+1];
for(int i=0;i<=n;i++){
for(int w=0;w<=capacity;w++){
if(i==0 || w==0){
k[i][w]=0;
}

else if(weight[i]<=w){

k[i][w]=Math.max(profit[i]+k[i-1][w-weight[i]],k[i-1][w]);

}


else{
k[i][w]=k[i-1][w];
}

}


}


//displaying the knapsack tabulation

for(int i=0;i<n+1;i++){
for(int j=0;j<capacity+1;j++){
if(i == n && j==capacity){
System.out.print("\u001b[37m"+"\u001b[31m "+k[i][j]+"\u001b[37m");
}else{
System.out.print("\u001b[37m"+"\u001b[32m "+k[i][j]+"\u001b[37m");
}
}
System.out.println();
}




}




}