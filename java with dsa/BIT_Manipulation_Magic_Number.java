//Bit Manipulation Q is magic Number Convert the n in binary and then where setbit is 1 take 5 power and return 

public class BIT_Manipulation_Magic_Number{

public static void main(String[] args){
int n=4;
MagicNumber(n);

}

//Return Magic Number
static void MagicNumber(int n){

int base=5;
int ans=0;

while(n>0){
int last =n&1;
System.out.println("last ------>  "+last);
n=n>>1;
System.out.println("n after right shift >> -->> "+n);
ans+=last*base;
base=base*5;

}



System.out.println("Magical Number is "+ans);

}




}