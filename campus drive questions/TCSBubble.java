//Tcs code Vita Bubble Sort Problem

import java.util.Arrays;
import java.util.Scanner;
public class TCSBubble{

public static void main(String[] args){

  Scanner sc=new Scanner(System.in);
  
  int n=sc.nextInt();
  
 int[] ar = new int[n];
      for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
  




int as=countBubbleSortSwaps(ar,true);
int ds=countBubbleSortSwaps(ar,false);
int z=getmin(as,ds);
System.out.println(z);



}
  
  //returning min
  
  static int getmin(int n1,int n2){
  if(n1<n2){
  return n1;
  }
    
   return n2;
    
  }
  



static int countBubbleSortSwaps(int[] arr, boolean ascending) {
        int n = arr.length;
        int swaps = 0;
        int[] temp = arr.clone(); // Clone array to avoid modifying original

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if ((ascending && temp[j] > temp[j + 1]) || (!ascending && temp[j] < temp[j + 1])) {
                    // Swap
                    int tempValue = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = tempValue;
                    swaps++;
                }
            }
        }

        return swaps;
    }


}