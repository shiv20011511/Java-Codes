public class Exceptionprogram {
    public static void main (String args[]){
//        Run time Exception Occur
//        Multiple catches
        int arr[]={2,3};
        try{
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e){
            System.out.println("EXCEPTION FOUND ** "+e);
            System.out.println(e.getMessage());
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("EXCEPTION FOUND ** "+e);
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("EXCEPTION FOUND ** "+e);
            System.out.println(e.getMessage());
        }
    System.out.println("Exception Handled ");
    }
}
