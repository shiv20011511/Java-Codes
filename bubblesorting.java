import java.util.Scanner;

public class bubblesorting {
    public static  void main(String args[]) {
//        declaring array with values
        Scanner sc=new Scanner(System.in);
        System.out.print("How many numbers you want to enter : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println();
        System.out.print("enter the numbers : ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
         System.out.print("Numbers entered ");
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("Numbers Sorted ");
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
