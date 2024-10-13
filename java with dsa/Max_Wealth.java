//MAX WEALTH leet code question to check the persons wealth and returning the max one (2DArray based)

/*
Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
*/


import java.util.Arrays;

public class Max_Wealth{

public static void main(String args[]){

int[][] accounts={
{2,8,7},
{7,1,3},
{1,9,5}
};
/*
int[][] accounts={
{1,5},
{7,3},
{3,5}
};
*/
System.out.println(Maximumwealth(accounts));


}



static int Maximumwealth(int[][] arr){


//creating variables of person to storing the wealth
int[] p=new int[arr.length];


for(int i=0;i<arr.length;i++){
for(int j=0;j<arr[i].length;j++){
p[i]+=arr[i][j];


}
System.out.println("Wealth"+p[i]);
}
int max=p[0];

for(int i=1;i<p.length;i++){
if(max < p[i]){
max=p[i];
System.out.println("Maximum -> "+max);
}

}




return max;
}





}