//Patterns Question and logics to build Patterns

public class Pattern_Ques{
public static void main(String args[]){

//Pattern1(9);
//Pattern2(4);
//Pattern3(14);
//Pattern4(14);
//Pattern5(10);
//Pattern_5(4);
//Pattern6(10);
//Pattern7(10);
//Pattern8(9);
//Pattern9(9);
Pattern10(3);
}

//Pattern 10

static void Pattern10(int n){
/*
1111111
1222221
1233321
1234321
1233321
1222221
1111111


*/



for(int row=1;row<2*n;row++){

for(int col=1;col<2*n;col++){
int ateveryindexvalue=n-Math.min(Math.min(row,col),Math.min(2*n-row,2*n-col));
System.out.print(ateveryindexvalue+" ");
//System.out.print(col);
}
System.out.println();
}	




}




//pattern 9

static void Pattern9(int n){

/*

     1
   2 1 2
 3 2 1 2 3
   2 1 2
     1


*/

for(int row=1;row<=2*n;row++){
System.out.print(" " );
int totalcolumn=row;
if(totalcolumn>=2*n/2){
totalcolumn=2*n-row;
}

int noofspaces=2*n-totalcolumn;


for(int s=1;s<=noofspaces;s++){
System.out.print(" ");

}

for(int col=totalcolumn;col>=1;col--){
System.out.print(col);
}


for(int col=2;col<=totalcolumn;col++){
System.out.print(col);
}

System.out.println();
}


}








//pattern 8

static void Pattern8(int n){

/*

     1
   2 1 2
 3 2 1 2 3

*/

for(int row=1;row<=n;row++){
int noofspaces=n;


for(int s=row;s<=noofspaces;s++){
System.out.print("  ");

}

for(int col=row;col>=1;col--){
System.out.print(col+" ");
}


for(int col=2;col<=row;col++){
System.out.print(col+" ");
}

System.out.println();
}


}





//pattern 7

static void Pattern7(int n){
//pattern
/*

  *
   * *
    * * *
     * * * *
      * * * * *
     * * * *
    * * *
   * *
  *
 
*/

for(int row=0;row<=2*n;row++){
System.out.print(" ");
int totalcolumn=row;
if(totalcolumn>=2*n/2){
totalcolumn=2*n-row;
}

int noofspaces=row;

if(noofspaces>=2*n/2){
noofspaces=2*n-row;
}

for(int s=0;s<=noofspaces;s++){
System.out.print(" ");
}



//System.out.println();
for(int col=0;col<=totalcolumn;col++){
System.out.print("* ");
}
System.out.println();

}


}


//pattern 6

static void Pattern6(int n){
//pattern
/*

    *
   * *
  * * *
 * * * *
  * * *
   * *
    *

*/

for(int row=0;row<=2*n;row++){

int totalcolumn=row;
if(totalcolumn>=2*n/2){
totalcolumn=2*n-row;
}

int noofspaces=n-totalcolumn;

for(int s=0;s<=noofspaces;s++){
System.out.print(" ");
}



//System.out.println();
for(int col=0;col<=totalcolumn;col++){
System.out.print("* ");
}
System.out.println();

}


}



//pattern 5 with less code

static void Pattern_5(int n){
for(int row=0;row<=2*n;row++){
int totalcolumn=row>n ? 2*n-row:row;


for(int col=0;col<=totalcolumn;col++){
System.out.print("*");
}
System.out.println();
}


}




//pattern 5
static void Pattern5(int n){
/*

*
**
****
*****
****
***
**
*

*/
for(int row=1;row<=2*n+1;row++){
if(row==(2*n/2)+1){
for(int col=1;col<=row;col++){
System.out.print("\u001b[36m"+"*"+"\u001b[37m");
}
}
if(row<(2*n/2)+1){
for(int col=1;col<=row;col++){

System.out.print("\u001b[32m"+"*"+"\u001b[37m");
}
}else if(row>(2*n/2)+1) {
for(int cols=row;cols<=2*n+1;cols++){
System.out.print("\u001b[31m"+"*"+"\u001b[37m");
}
}

System.out.println();
}



}



//pattern 4
static void Pattern4(int n){
/*

1
12
123
1234
*/
for(int row=1;row<=n;row++){
for(int col=1;col<=row;col++){
System.out.print(col+" ");
}
System.out.println();
}



}




//pattern 1
static void Pattern1(int n){
/*
*
**
***
****
*/

for(int row=0;row<n;row++){
for(int col=0;col<=row;col++){
System.out.print("*");

}
System.out.println();

}
}

//pattern 2
static void Pattern2(int n){
/*
****
****
****
****
*/

for(int row=1;row<=n;row++){
for(int col=1;col<=n;col++){
System.out.print("*");
}
System.out.println();
}



}

//pattern 3

static void Pattern3(int n){
/*

****
***
**
*

*/
for(int row=1;row<=n;row++){
for(int col=row;col<=n;col++){
System.out.print("*");
}
System.out.println();
}


}





}