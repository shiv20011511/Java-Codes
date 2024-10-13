//Recursion Topics with Programs

public class Recursion_1{
public static void main(String args[]){


//prog1 fibonnaci with recursion
//System.out.println("This is With Recursion ---- "+Fibonnaci_Series(5));

//above function with recursion can't handle greater number because of repeated function calls again and again (exponential Time Complexity)


//Prog 2
//System.out.println("This is without Recursion ** "+FiboWithoutRecursion(5));

//prog3

for(int i=0;i<11;i++){

System.out.println(Fibo_with_recursion_Optimize(i));
}


}

//prog3 Fibonnaci with Recursion Optimized

static int Fibo_with_recursion_Optimize(int n){

return (int) (Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));

}



//Prog 1 Find nth Fibonacci series with Recursion

static int Fibonnaci_Series(int n){
//base condition 

if(n<2){
//System.out.println("BASE -->> "+n);
return n;

}
//System.out.println("This is n "+n);

int last=Fibonnaci_Series(n-1);
int slast=Fibonnaci_Series(n-2);
//System.out.println("This is last "+last);
//System.out.println("This is slast "+slast);
//System.out.println("This is add of last  and slast"+last+slast);
return last+slast;

}


//prog2 fibonacci without recursion

static int FiboWithoutRecursion(int n){
int s1=-1;
int s2=1;
int sum=0;

for(int i=1;i<=n+1;i++){

sum=s1+s2;

s1=s2;
s2=sum;

System.out.println("-->> "+sum);

}


return sum;
}





}












