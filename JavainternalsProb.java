import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class JavainternalsProb {
    public static void main(String[] args){
//        wap to split the array of twent integers into odd and even numbers and find the sum of the third largest element from odd and even arrary user input
        Scanner scanner = new Scanner(System.in);

        // Initialize an array of twenty integers
        int[] numbers = new int[20];

        // Input twenty integers from the user
        System.out.println("Enter 20 integers:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Separate even and odd numbers
        int[] evenArray = new int[20];
        int[] oddArray = new int[20];
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenArray[evenCount] = number;
                evenCount++;
            } else {
                oddArray[oddCount] = number;
                oddCount++;
            }
        }

        // Sort the arrays in descending order
        Arrays.sort(evenArray, 0, evenCount);
        Arrays.sort(oddArray, 0, oddCount);

        // Calculate the sum of the third largest even and odd numbers
        int sumEven = 0;
        int sumOdd = 0;
//        System.out.println(evenCount);
        if (evenCount >= 3) {
            sumEven = evenArray[evenCount - 3];
        }

        if (oddCount >= 3) {
            sumOdd = oddArray[oddCount - 3];
        }

        // Display the results
        System.out.println("Even numbers: " + Arrays.toString(evenArray));
        System.out.println("Odd numbers: " + Arrays.toString(oddArray));
        System.out.println("Sum of the third largest even number: " + sumEven);
        System.out.println("Sum of the third largest odd number: " + sumOdd);

        // Close the scanner
        scanner.close();
    }
}
