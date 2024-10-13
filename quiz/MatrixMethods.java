package quiz;
import java.util.Scanner;

public class MatrixMethods {
//    in this i will perform all matrix operations
    public static void main(String args[]){
        MatrixMethods mm=new MatrixMethods();
        mm.matrixInsert();

    }

    public int[][] matrixInsert(){
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();

        int[][] m1=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                m1[i][j]=Integer.parseInt(s.next());

            }
        }

        System.out.println("Matrix 1");
        Print(m1,row,col);

        int row2=s.nextInt();
        int col2=s.nextInt();
        int[][] m2=new int[row2][col2];
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                m2[i][j]=Integer.parseInt(s.next());
            }
        }
        System.out.println("Matrix 2");
        Print(m2,row2,col2);
        AddMatrix(m1,m2,row,col,row2,col2);


MulMatrix(m1,m2,row,col,row2,col2);
        return m1;
    }
	
public int[][] MulMatrix(int[][] m1,int[][] m2,int row,int col,int row2,int col2){

int[][] m4=new int[row][col2];

if(col!=row2){
System.out.println("Matrix cant be added ");
return m1;
}else{
    int temp=0;
    for(int i=0;i<m1.length;i++){
for(int j=0;j<m2[0].length;j++){
    for(int k=0;k<col;k++) {
//logic not done yet
        temp = m1[i][k] * m2[k][j];
        m4[i][j]+=temp;
//        System.out.println(temp);
    }
}


}
System.out.println("\u001b[31m"+"Multiplication of matrices ");
    Print(m4,row,col2);
return m4;

}



}

    public int[][] AddMatrix(int[][] m1,int[][] m2,int row,int col,int row2,int col2){
        int[][] m3=new int[row][col];
        if(row!=row2 && col!=col2){
            System.out.println("Matrix cant be added ");
            return m1;
        }else{
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    m3[i][j]=m1[i][j]+m2[i][j];
                }
            }
        }
        System.out.println("Addition of matrices ");
        Print(m3,row2,col2);
        return m1;

    }
    
    void Print(int[][] m1,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(m1[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
