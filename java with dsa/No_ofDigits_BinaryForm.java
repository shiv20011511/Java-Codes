//nO OF  digits in Binary form  

public class No_ofDigits_BinaryForm{
public static void main(String args[]){
int n=3;
Digits(1);
Digits(4);
Digits(14);
Digits(32);
Digits(128);
}

static void Digits(int n){
int count=0;

while(n>0){
n=n>>1;
count++;

}
System.out.println("No of Digits in Binary of Decimal is -->> "+count);
}

}