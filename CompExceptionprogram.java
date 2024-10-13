public class CompExceptionprogram {
    public static void main(String args[]){
//        Thread.sleep(1000) got errors while compilation
    try {
        Thread.sleep(0);
    }
    catch (InterruptedException e){
    }
    System.out.println("Interrupted Exception Handled");
    }
}
