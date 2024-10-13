import java.util.Arrays;
public class TwodArrayinternalproblem {
    public static void main(String[] args){
//        wap to print left column ,bottom row ,right column and top row wise elements of two dimensional array containing 1 to 40 of dimensions 8 by 5
        int value=1;
        int[][] two=new int[5][8];
        for (int i=0;i<5;i++){
            for (int j=0;j<8;j++){
                    two[i][j] =value;
                    value++;

            }
        }
        for (int i=0;i<5;i++){
            for (int j=0;j<8;j++){
                System.out.print(two[i][j]+"   ");
            }
            System.out.println();
        }
//        left column
        for (int i=0;i<5;i++){
            System.out.println(two[i][0]);
        }
//        System.out.println();
//        bottom row
        for (int i=0;i<8;i++){
            System.out.print(two[4][i]+"  ");
        }
        System.out.println();

    }
}
