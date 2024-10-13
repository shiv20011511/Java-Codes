//Finding Square root of a number with using Binary Search

public class Square_root_BinarySearch{
public static void main(String args[]){

//System.out.println(BinarySearch(50));


//for Non perfect square roots
int noofdecimal=3;
System.out.printf("%.3f",BinarySearchSqrt(40,noofdecimal));


}

//Applicable with Non perfect Sqaure Numbers
// O(logN)
static double BinarySearchSqrt(int n,int p){

int s=0;
int e=n;

double root=0.0;

while(s<=e){
int m=s+(e-s)/2;

if(m*m==n){
return m;
}

if(m*m>n){
e=m-1;
}else{
s=m+1;
}

}

double incre=0.1;
for(int i=0;i<p;i++){

while(root*root<=n){
root+=incre;
}

root-=incre;
incre/=10;

}


return root;
}



//method that finds
//only for perfect Sqaure Numbers
static int BinarySearch(int n){
int start=0;
int end=n;
int close=0;

while(start<=end){
int mid=start+(end-start)/2;

if(mid*mid==n){
return mid;
}

if(mid*mid>n){

end=mid-1;

}else{

start=mid+1;
}


}


return end;
}


}