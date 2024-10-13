public class Multithreadsingletask {
    public static void main(String[] args) {
        int numThreads = 5; // Number of threads to create

        // Create a single Runnable task
        Runnable task = new Task();

        // Create and start multiple threads, each executing the same task
        for (int i = 1; i <= numThreads; i++) {
            Thread thread = new Thread(task, "Thread " + i);
            thread.start();
        }
    }
    static class Task implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + " - Step " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    System.out.println(threadName + " was interrupted.");
                }
            }
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " has completed.");
        }
    }
}
