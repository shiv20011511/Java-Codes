class Spiralmatrix{
    public static void main(String args[]){
        int value=1;
        int[][] twod=new int[5][8];
        for (int i=0;i<5;i++){
            for (int j=0;j<8;j++){
                twod[i][j]=value;
                value++;
            }
        }
        System.out.println("Matrix : ");
        for (int i=0;i<5;i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(twod[i][j]+"  ");
            }
            System.out.println();
        }
//        displaying in spiral format
        System.out.println("displaying LEFT column");
        for(int i=0;i<5;i++){
                twod[i][0]=twod[i][0];
                System.out.println(twod[i][0]+" ");
        }
            System.out.println();

        System.out.println("displaying top row");
        for (int i=0;i<8;i++){
            twod[0][i]=twod[0][i];
            System.out.print(twod[0][i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("displaying bottom row");
        for (int i=0;i<8;i++){
            twod[4][i]=twod[4][i];
            System.out.print(twod[4][i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("displaying Right column");
        for (int i=0;i<5;i++){
            twod[i][7]=twod[i][7];
            System.out.println(twod[i][7]+" ");
        }

        }
}
