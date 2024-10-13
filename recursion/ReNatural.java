//recursion question 1 to print n natural numbers 

public class ReNatural{

    public static void main(String[] args) {
        int n = 5; // You can change this value to calculate the sum for a different number of natural numbers
        int sum = calculateSum(n);
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }

    // Recursive function to calculate the sum of first n natural numbers
    static int calculateSum(int n) {
        if (n == 0) {
          return 0; // Base case: the sum of the first natural number is 1
        } else {
		System.out.println(n);
		return calculateSum(n-1);
            //return n + calculateSum(n - 1); // Recursive case: sum of first n numbers = n + sum of first (n-1) numbers
 }



    }
}
