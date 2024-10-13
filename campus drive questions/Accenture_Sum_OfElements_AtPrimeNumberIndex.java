//Accenture Question (16 August)

import java.util.Arrays;

public class Accenture_Sum_OfElements_AtPrimeNumberIndex{

public static void main(String args[]){

//area of conopy question
int n=6;
double f=3.14*n*n;
int x=(int) f;


System.out.println(f);
System.out.println(x);

//prime question

int[] ar={10,20,30,40,50,60,70,80,90,100};
System.out.println("Arrays is ------->>>  "+Arrays.toString(ar));
System.out.println(SumPrimeIndex(ar));
}

//functions that check The prime Number

static Boolean Isprime(int nums){
//boundary conditions
if(nums==0 || nums==1){
return false;
}

if(nums==2){
return true;
}

for(int i=2;i<nums;i++){
if(nums%i==0){
return false;
}
}

return true;

}



//function that return Sum

static int SumPrimeIndex(int[] ar){
int sum=0;
for(int i=0;i<ar.length;i++){
if(Isprime(i)){
System.out.println("Array Element At Prime Index -->> "+ar[i]);
sum+=ar[i];
}
}
return sum;
}


}