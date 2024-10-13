package quiz;
import java.util.Scanner;

public class NumberPallindrome {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println("\u001b[36m"+NumberChecker(num));


    }

    static int NumberChecker(int x){
        int numb=0;
        while (x!=0){
            int rem=x%10;
            System.out.println("\u001b[32m"+rem);
            numb=rem;
             x= x/10;
        }
return numb;

    }

}
