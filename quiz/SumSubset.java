// To solve sum of subset problem
//using recursion
class SumSubset{
public static void main(String args[]){

int[] s={7,11,13,24};
int target=31;

PrintTargetSumSubsets(s,0,"",0,target);

}

public static void PrintTargetSumSubsets(int[] a,int idx,String set,int sum,int target){



int[] arr=new int[a.length];
if(idx==a.length){

if(sum==target){
System.out.println("\u001b[32m"+"[ "+set+"]");

for(int i=0;i<set.length();i++){
if(Character.toString(set.charAt(i)).equals(" ")){
}else{
arr[i]=Integer.parseInt(Character.toString(set.charAt(i)));
}
}
for(int i=0;i<arr.length;i++){
for(int j=0;j<a.length-1;j++){
if (arr[i]==a[j]){
System.out.print(1);
}else{
System.out.print(0);
}
}
}


}else{
//System.out.println("\u001b[31m"+"[ "+set+"]");
}

return;
}
//yellow
//System.out.println("\u001b[33m"+"\t "+a[idx]+" \t");

PrintTargetSumSubsets(a,idx+1,set+a[idx]+" ",sum+a[idx],target);
//red
//System.out.println("\u001b[31m"+"\t "+sum+" \t");
//System.out.println("\u001b[31m"+"\t "+sum+" \t"+" "+a[idx]);
PrintTargetSumSubsets(a,idx+1,set,sum,target);
//System.out.print("\u001b[37m");


}



}
