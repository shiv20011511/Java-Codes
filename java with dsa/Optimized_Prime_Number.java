//Optimized Prime Number Checker

public class Optimized_Prime_Number{

public static void main(String args[]){

int n=400;
boolean[] primes=new boolean[n+1];
PrimeStore(primes,n);
//to store prime numbers in a given range



//to check which is prime in given range
/*
for(int i=0;i<=40;i++){

boolean ans=IsPrime(i);
if(ans){
System.out.println(i+" Is Prime "+ans);
}
}
*/

}


//function that stores prime number in array

static void PrimeStore(boolean[] ar,int n){



for(int i=2;i*i<=n;i++){

if(!ar[i]){

for(int j=i*2;j<=n;j+=i){

ar[j]=true;

}


}


}


//displaying only false index in array

for(int i=2;i<=n;i++){

if(!ar[i]){
System.out.println("prime in Given Range -->> "+i);
}
}




}




//function that checks

static Boolean IsPrime(int n){

if(n<=1){
return false;
}

int c=2;

while(c*c<=n){

if(n%c==0){
return false;
}

c++;


}


return true;
}


}