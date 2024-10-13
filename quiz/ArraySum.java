package quiz;
import java.util.Scanner;

public class ArraySum {
public static  void main(String args[]){
    Scanner s=new Scanner(System.in);
    int size=s.nextInt();
    int[] ar=new int[size];
    for(int i=0;i<size;i++){
        int temp=Integer.parseInt(s.next());
        ar[i]=temp;
    }
    ArraySum as=new ArraySum();
    System.out.println(as.sumofarray(ar));
}
    int sumofarray(int[] ar){
    int sum=0;
        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
        }
        return sum;
    }
}
