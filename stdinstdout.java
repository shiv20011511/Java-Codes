import java.util.Scanner;

public class stdinstdout {
    public static void main(String[] args){
//        code for standard input and output
//        Scanner scan=new Scanner(System.in);
//        int a=scan.nextInt();
//        int b=scan.nextInt();
//        int c=scan.nextInt();
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        ***code for printing in specific type
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            String s2=sc.next();
            int y=sc.nextInt();
            String s3=sc.next();
            int z=sc.nextInt();
            System.out.println("================================");
            System.out.println(s1+"               "+x);
            System.out.println(s2+"               "+y);
            System.out.println(s3+"               "+z);
            System.out.println("================================");

            //Complete this line
        }


    }
}

