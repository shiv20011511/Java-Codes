import java.util.Scanner;
class dectobin {
//program to convert decimal number to binary number
    public static void main(String[] var0) {
        int rem,rev=1,sum=0;
	Scanner sc=new Scanner(System.in);
	int dec=sc.nextInt();
	System.out.println("Enter your Decimal Number : ");
        while (dec!=0)
        {
            rem=dec%2;
            sum=sum+rem*rev;
            rev=rev*10;
            dec=dec/2;
        }
        System.out.println("Your Binary : "+sum);
    }
}

     