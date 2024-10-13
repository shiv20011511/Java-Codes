import java.util.*;
import java.lang.Math;
class Firstclass{
    public static void main(String args[]) {
        int rem,sm=0,original;
        System.out.print("Enter Number to check Armstrong : ");
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        original=number;
        int n=number;
        String l=Integer.toString(n);
        int length=l.length();
        while (number!=0)
        {
            rem=number%10;
            double resul=Math.pow(rem,length);
            sm= (int) (sm+resul);
            number=number/10;
        }
        if (original==sm)
        {
            System.out.println("armstrong : "+original);
        }
        else
        {
            System.out.println("Not armstrong : "+original);
        }
    }
}

