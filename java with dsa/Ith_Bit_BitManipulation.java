// Questions on Find the ith Bit and Set the ith Bit

public class Ith_Bit_BitManipulation{

public static void main(String args[]){

//int n=182;
int n=16;

FindithBit(n,5);

Actual_Value_At_ithBit(n,5);

Set_Bit_1(10,3);
}

//Question Number 1 Find the ith Bit Of a number

static void FindithBit(int n,int bit){

//for finding the bit value

System.out.print("To find the ith Bit Is 0 or 1 in an Integer --->>> ");
System.out.println((n>>(bit-1))&1);


}


//Question is to set the ith Bit 1

static void Set_Bit_1(int n,int bit){

//to find its 1 0r not 
System.out.println((n>>(bit-1))&1);

//to make it 1

//n+=((n>>(bit-1))|1);
System.out.println((n>>(bit-1)) | 1);

System.out.println(n);

}




//Question To find the actual value at ith Bit
static void Actual_Value_At_ithBit(int n,int bit){

System.out.print("Actual Value at Ith Bit is -->> ");
System.out.println(n&(1<<(bit-1)));

}



}