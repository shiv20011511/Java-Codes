public class Multiplethreadmultitask {
    public static void main(String[] args) {
        int numThreads = 5; // Number of threads to create
        // Create and start multiple threads, each executing the same task
        for (int i = 1; i <= numThreads; i++) {
            Thread thread = new Thread(new Task("Thread " + i));
            thread.start();
        }
    }
    static class Task implements Runnable {
        private final String threadName;

        public Task(String name) {
            this.threadName = name;
        }
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " - Step " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    System.out.println(threadName + " was interrupted.");
                }
            }
            System.out.println(threadName + " has completed.");
        }
    }
}
