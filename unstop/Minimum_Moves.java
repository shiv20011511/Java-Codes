//minimum number of moves
import java.util.Scanner;
import java.util.Arrays;
public class Minimum_Moves{
public static void main(String args[]){


      Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Read the target array
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            target[i] = scanner.nextInt();
        }

//result array with 0 elements
int[] result=new int[n];

System.out.println("This is the target Array -> "+Arrays.toString(target));
        // Variable to keep track of the number of operations
        int operations = 0;
	
        // We assume the array starts from 0, so the first operation is to set the first element
        operations += target[0];
result[0]=operations;
System.out.println("This is Operations -> "+operations);
        // Loop through the array to 	calculate the number of required operations
        for (int i = 1; i < n; i++) {
            if (target[i] > target[i - 1]) {
                operations += (target[i] - target[i - 1]);
System.out.println("This is Operations in loop -> "+operations);
result[i]=operations;

//0 1 2 3 4
//1 2 3 2 1
            }else{

result[i]=target[i];
}
        }

        // Print the result
        System.out.println(operations);

//result array 
System.out.println("This is the result array -> "+Arrays.toString(result));

    }
}