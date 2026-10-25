class Counter {
    int counter = 0;

    public synchronized void increment() { // Synchronized method to prevent race condition
        counter++;
    }
}
 // race condition occurs when two or more threads access shared data and try to change it at the same time. In this example, we have a Counter class with a synchronized increment method to ensure that only one thread can modify the counter at a time, preventing race conditions.

public class race_condition{
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable threadA = () -> 
        {
            for (int i = 0; i < 1000; i++) {
                counter.increment(); // Synchronized method to prevent race condition
            }
        };

        Runnable threadB = () -> 
        {
            for (int i = 0; i < 1000; i++) {
                counter.increment();   // Synchronized method to prevent race condition
            }
        };

        Thread t1 = new Thread(threadA);
        Thread t2 = new Thread(threadB);

        t1.start();
        t2.start();

        t1.join(); // Wait for thread t1 to finish
        t2.join(); // Wait for thread t2 to finish

        System.out.println("Final Counter Value: " + counter.counter);
    }
}