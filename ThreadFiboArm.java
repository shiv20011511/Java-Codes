public class ThreadFiboArm {
    public static void main(String[] args) {
        FibonacciArmstrongNumbers numbersPrinter = new FibonacciArmstrongNumbers();
        Thread fibonacciThread = new Thread(numbersPrinter::printFibonacci, "FibonacciThread");
        Thread armstrongThread = new Thread(numbersPrinter::printArmstrong, "ArmstrongThread");
        fibonacciThread.start();
        armstrongThread.start();
    }
} 
