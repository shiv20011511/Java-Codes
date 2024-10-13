//Accentur Question = to sum of all even index element after reversing the array
import java.util.Arrays;
public class Accenture_Array_Even{

public static void main(String[] args){
int[] ar={20,30,40,50,60};
//int[] ar={21,24,67,13,24,27};
System.out.println("Original -->> "+Arrays.toString(ar));

System.out.println(ReverseAndSumEven(ar));

}

//function that reverse and sum even position

static int ReverseAndSumEven(int[] ar){
int start=0;
int end=ar.length-1;

while(start<end){
int temp=ar[start];
ar[start]=ar[end];
ar[end]=temp;

start++;
end--;
}

System.out.println("After Reversing -->> "+Arrays.toString(ar));

int sum=0;
//sum of even
for(int i=0;i<ar.length;i+=2){
sum+=ar[i];

}

return sum;

}


}