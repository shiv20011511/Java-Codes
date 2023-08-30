import java.lang.Math;
import java.util.Scanner;

public class bintodec {
//    program to convery binary to dec
    public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            int bin = scan.nextInt();
            int sum = 0, i = 0;
            int rem;
            while (bin != 0) {
                rem = bin % 10;
                sum += rem * Math.pow(2, i);
                i = i + 1;
                bin = bin / 10;

            }
            System.out.println("your decimal number : "+sum);
        }

}
