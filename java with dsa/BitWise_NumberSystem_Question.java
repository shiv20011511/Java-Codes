//Number System & Bit-wise Questions 


public class BitWise_NumberSystem_Question{
public static void main(String args[]){
int n=5;

//System.out.println(OddEven(n));
//test cases;
System.out.println("Test case -->> "+OddEven(7));

}

//function that returns if it's odd or even
static Boolean OddEven(int n){
System.out.println("Number for testing -->> "+n);
System.out.println(n & 1);
return (n & 1)==0;


}



}