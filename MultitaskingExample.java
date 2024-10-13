public class MultitaskingExample {
    public static void main(String[] args) {
        // Create and start two threads
        Thread thread1 = new Thread(new Task("Task 1"));
        Thread thread2 = new Thread(new Task("Task 2"));
        thread1.start();
        thread2.start();
    }

    static class Task implements Runnable {
        private final String taskName;

        public Task(String name) {
            this.taskName = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(taskName + " - Step " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    System.out.println(taskName + " was interrupted.");
                }
            }
            System.out.println(taskName + " has completed.");
        }
    }
}
