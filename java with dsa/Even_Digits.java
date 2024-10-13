//leetcode question EVEN DIGIT
//in this we have an array of elements and we have to find which element has even digit for ex( 4  is a even number but according to this question 4 contains 1 digit so it would be odd).

import java.util.Arrays;

public class Even_Digits{
public static void main(String args[]){
//int[] arr={1,2,3,4,56,435,43,23,4444,44444,666666};
int[] arr={12,345,2,6,7896,-24};
//evendigitcalculator(arr);
System.out.println("Negative to positive check ->-> "+Arrays.toString(arr));

//System.out.println(Arrays.toString(evendigitcalculator(arr)));

System.out.println(evendigitcalculator(arr));

System.out.println("Negative to positive check ->-> "+Arrays.toString(arr));

}

//main function that finds the every element digits
static int evendigitcalculator(int[] arr){
int count=0;




for(int i=0;i<arr.length;i++){
//base condition to convert negative into positive
if(arr[i]<0){
arr[i]=arr[i]*-1;
}

int temp=arr[i];
int digit=0;
while(temp!=0){

digit++;

temp=temp/10;

}

if(digit%2==0){
System.out.println("Digit Even is ->->"+digit+" element is ->-> "+arr[i]);
count++;
}



digit=0;
}


return count;

}



}