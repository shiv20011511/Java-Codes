package quiz;
import java.util.Scanner;

public class PrimeNumberChecker {
    boolean Checker(int n){
        if (n==1 || n==2){
            return true;
        }

        for(int i=2;i<n;i++){

            if (n%i == 0){

                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        PrimeNumberChecker p=new PrimeNumberChecker();
        Scanner s=new Scanner(System.in);

do {
    int number = s.nextInt();
    System.out.println(p.Checker(number));
}while(true);
    }

}
