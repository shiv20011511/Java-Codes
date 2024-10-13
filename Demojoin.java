public class Demojoin {
    public static void main(String[] args) {
        // Create two threads with Runnable instances
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        // Start both threads
        thread1.start();
        thread2.start();
        try {
            // Wait for thread1 to finish
            thread1.join();
            // Wait for thread2 to finish
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }
        System.out.println("Main thread has finished.");
    }
    // Custom Runnable class
    static class MyRunnable implements Runnable {
        private String name;

        public MyRunnable(String name) {
            this.name = name;
        }
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + ": " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    System.out.println(name + " was interrupted.");
                }
            }
        }
    }
}
