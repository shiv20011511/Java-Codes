class Exceptionnestedtry{
    public static void main(String args[]){
        int n=9;
        int m=0;
        int arr[]={1,2,3};
        try{
            System.out.println(n/m);
            try {
                System.out.println(arr[7]);

                try {
                    System.out.println(n + m);
                }catch (Exception e){
                    System.out.println(e);
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Exception handled");
            }
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("all exception handled");
    }
}