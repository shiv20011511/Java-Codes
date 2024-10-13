//asked question in exam
class patternExam{
public static void main(String args[]){
int n=5;
int z=n/2;
int c=1;
int v=1;
//created nested loop to print in this format
/*1
  12
  123
  1234
  12345 
*/
for (int i=1;i<n+1;i++){
for (int j=1;j<i+1;j++){
// logic to create the * pattern in repeated element
if(i-1==j || i-2==j+1){ //extra for n=7 || i-3==j+2)

System.out.print("*");


}else{
System.out.print(j);
}


//System.out.print(j);
}


System.out.println();

}
//System.out.println("divisiblity check : "+ 7/ 2);
}

}
//output
/*
1
*2
1*3
*2*4
1*3*5
*/


