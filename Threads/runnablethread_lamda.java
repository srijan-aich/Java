public class runnablethread_lamda {
    public static void main(String[] args) {
        Runnable threadA = () -> 
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread A: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        };

        Runnable threadB = () -> 
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread B: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        };

        Thread t1 = new Thread(threadA);
        Thread t2 = new Thread(threadB);

        t1.start();
        t2.start();
    }
}
