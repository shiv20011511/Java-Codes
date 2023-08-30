import java.util.*;

class Firstclass{
    public static void main(String args[]) {
        // simple calculator
        int a=30;
        int b=20;
        int sum=a+b;
        System.out.println("hello shiv sum of the numbers "+sum);
        System.out.println(" code is succesfully running");
        // armstrong program
        int rem,sm=0,number=375,original;
        original=number;
        // String len=String.format("%d",original);
        // int length=len.length();
        // System.out.println("string format "+len);
        // System.out.println("length of a string "+length);

        while (number!=0)
        {
            rem=number%10;
            // System.out.println(rem);
            sm=sm+rem*rem*rem;
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

        // int c=3;
        // // int pow=(c**3);
        // System.out.println(Math.pow(c,50));
        Scanner ss =new Scanner(System.in);
        String name=ss.nextLine();
        System.out.println(name);

    }
}

