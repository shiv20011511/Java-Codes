
import java.util.*;

// Question is to sum the factors of each element 


public class IBM_Question_SumFactor{

public static void main(String args[]){

List<Integer> k=new ArrayList<>();

k.add(3432415);
k.add(33434356);
k.add(84324327);
k.add(9232138);
k.add(543243249);
k.add(312132130);
k.add(423232138);
k.add(422222228);
System.out.println("Original Array -->> "+k);


List<Long> ar=maxSubsetSum(k);
System.out.print("Original elements sum factor -- >> ");
Display(ar);


}




//method to iterating through provided list
static List<Long> maxSubsetSum(List<Integer> k) {
    // Write your code here
        List<Long> arr = new ArrayList<>();
        for(int i=0;i<k.size();i++){
            int val=k.get(i);
            // int x=
            arr.add(GetSum(val));
        }
        
        return arr;
    }

//method for finding each element's factor sum
    
    public static long GetSum(int val){
        long sum=0;

System.out.println("************ Value Of array is = "+val);
        for(int i=1;i*i<=val;i++){
           if (val % i == 0) {
                sum += i;
                // If `i` is not the square root of `val`, add the corresponding factor

		if (i != val / i) {
                    sum += val / i;
                }

		System.out.println("Its Factor is = "+i);
            }
        }
        
        return sum;
        
    }

//method for display

static void Display(List<Long> ar){

for(int i=0;i<ar.size();i++){

System.out.print(ar.get(i)+" ");
}
System.out.println();
}


}