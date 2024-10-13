//Company name RemoteState second round - 25-07-2024

//Q1 first unique element in an array time complexity required (n log n)

public class RemoteState_Q1{
public static void main(String args[]){
int[] ar={1,4,1,3,2,3};

//below not working works only for specific data
System.out.println(UsingXor(ar));

//below brute works everytime 
//System.out.println(Unique(ar));
//System.out.println(unique(ar));

}

static int Unique(int[] ar){

int[] count=new int[ar.length];

for(int i=0;i<ar.length;i++){
for(int j=i+1;j<ar.length;j++){

if(ar[i]==ar[j]){

count[i]++;
count[j]++;
//System.out.println(ar[i]+" "+count);
}


}

if(count[i]==0){

return ar[i];
}

}

return -1;

}





//for optimisation using xor (bitwise operator)

static int UsingXor(int[] ar){
int unique=0;
for(int i=0;i<ar.length;i++){



unique = unique | ar[i];

}

return unique;

}


//self one disappointing
static int unique(int[] ar){

int unique=0;

for(int i=0;i<ar.length-1;i++){
for(int j=i+1;j<ar.length;j++){
if(ar[i]==ar[j]){
break;
}





}

if(unique!=0){
return unique;
}

}

return -1;
}

}