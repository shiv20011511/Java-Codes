//Accenture Question Desc --> Seconf largest element with occurrence

import java.util.Arrays;

public class Accenture_SecondLargest_Occurrence{
public static void main(String args[]){
//int[] ar={1,2,3,4,4,5,5,5};
int[] ar={10,2,100,15};
System.out.println("Array is -->> "+Arrays.toString(ar));



Second_Largest(ar);

}


//function that finds second largest
static void Second_Largest(int[] ar){

int largest=ar[0];
int secondlargest=0;

for(int i=1;i<ar.length;i++){

if(ar[i]>largest){
secondlargest=largest;
largest=ar[i];

}else if(ar[i]<largest && ar[i]>secondlargest){
secondlargest=ar[i];
}

}

System.out.println("Second largest is = "+secondlargest);

int oc=getOccurence(ar,secondlargest);
System.out.println("Occurence "+oc);
}



//function that returns the Number of Occurence 

static int getOccurence(int[] ar,int n){
int count=0;

for(int i=0;i<ar.length;i++){

if(ar[i]==n){
count++;
}

}

return count;
}



}