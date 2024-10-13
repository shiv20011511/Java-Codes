package test;

public class test2 {
    public static void main(String args[]){
      int[] n={1,2,3,9};
      int l=n.length;
      for(int i=l-1;i>=0;i--){
          if(n[i] == 9){
              n[i]=0;
          }else{
            n[i]++;
            System.out.print(n[i]+",");
          }

      }
        System.out.println();
      int[] newnumb=new int[l+1];
      newnumb[0]=1;
      for(int i=0;i<newnumb.length;i++){
          System.out.print(newnumb[i]+",");
      }
        System.out.println();
    }
}
