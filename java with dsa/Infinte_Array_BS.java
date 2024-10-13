//Question is to find element in an infinite array here the word itself infinite says we dont know the length of provide array


//acheived but taking more combinations but acheived

import java.util.*;

public class Infinte_Array_BS{

public static void main(String args[]){
//creating a array with assuming it is infinite
//but array is sorted Question says

Scanner sc=new Scanner(System.in);


int[] arr=new int[65345430];

for(int i=0;i<65345430;i++){
arr[i]=i;
}

//testing


//System.out.println("Infinte array ->-> "+Arrays.toString(arr));

System.out.print("Enter Your Target -> ->");

int target=sc.nextInt();

//Hard Testing 
/*
int loopcount=0;
int failures=0;
int failvalue=0;

System.out.println();
for(int i=0;i<65346;i++){

int ans=Searching_Infinite(arr,i);
System.out.println("Elment Found ->->->-> "+ans);
if(ans==-1){
failvalue=i;
failures++;

}
loopcount++;
}

System.out.println("Loop counter running (Testing ) ->--> "+loopcount);
System.out.println("Failures running (Testing ) ->--> "+failures+" Fail value ->-> "+failvalue );


*/


System.out.println("Elment Found at index ->->->-> "+Searching_Infinite(arr,target));

/* Not so corrected it gives the exception array out of bound beacause it assumes that array is infinite
System.out.println("Corrected Ans"+Infinite_SearchingBS(arr,target));
*/
}



//correct One
static int Infinite_SearchingBS(int[] arr,int target){
int start=0;
int end=1;

//condition to pass start and end in binary search
int count=0;
while(target>arr[end]){
int newstart=end+1;
//size of the box
end=end+(end-start+1)*2;
start=newstart;
count++;
System.out.println("Start ->>>"+start);
System.out.println("end ->>>"+end);

}

System.out.println("count ->->-> "+count);

//calling and returning the binary search


return Binary_Search(arr,target,start,end);


}


//creating a binary search with start and end (supporting function above)

static int Binary_Search(int[] ar,int target,int start,int end){

while(start<=end){

int mid=start+(end-start)/2;

if(target>ar[mid]){
start=mid+1;
}else if(target<ar[mid]){
end=mid-1;
}else{
//==

return mid;

}


}

return -1;
}











//old one
static int Searching_Infinite(int[] ar,int target){
int start=0;
int end=1;
int count=0;

while(start<=end){
int mid=start+(end-start)/2;

try{
count++;

if(ar[mid]==target){
System.out.println("**************************Count inside try  value ->-> "+count);
return mid-1;
}else if(target>ar[mid]){

start=mid+1;


end=start*2; //og

//end=(start)+end;


//System.out.println(mid);
}else if(target<ar[mid]){
end=mid-1;
//start/=2;
}else{

//start=end/3;
}

}catch(Exception e){
//in this array out of bound exception occurs



end=end/2;
//start=start/2;	

/*
System.out.println("End in Catch **********"+end);

System.out.println("start in Catch **********"+start);


*/

}



}


return -1;
}





}