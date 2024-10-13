class Company {
    int n;
    public synchronized void produceItem(int n) {
        this.n = n;
        System.out.println("Produced: " + this.n);
        notify(); // Notify waiting consumers that an item is available
    }
    public synchronized int consumeItem() {
        while (n == 0) {
            try {
                wait(); // Wait if there are no items to consume
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed item: " + this.n);
        int consumed = this.n;
        this.n = 0; // Reset the item after consumption
        return consumed;

    }
    class Producer extends Thread {
        public void run() {
            int i = 1;
            while (true) {
                produceItem(i++);
                try {
                    Thread.sleep(1000); // Simulate some production time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    class Consumer extends Thread {
        public void run() {
            while (true) {
                int consumed = consumeItem();
                // Perform operations with the consumed item if needed
                try {
                    Thread.sleep(1000); // Simulate some consumption time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
  public static void main(String[] args) {
        Company company = new Company();
        Producer producer = company.new Producer();
        Consumer consumer = company.new Consumer();

        producer.start();
        consumer.start();
    }
}  
