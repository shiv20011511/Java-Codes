class dectobin {
//program to convert decimal number to binary number
    public static void main(String[] var0) {
        int rem,rev=1,dec=255,sum=0;
        while (dec!=0)
        {
            rem=dec%2;
            sum=sum+rem*rev;
            rev=rev*10;
            dec=dec/2;

        }
        System.out.println("your binary : "+sum);
    }
}