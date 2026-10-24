class E implements Runnable{

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread A: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

class F implements Runnable{

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread B: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
public class runnable_thread {
    public static void main(String[] args) {
        /*E threadA = new E(); 
        F threadB = new F();

        Thread t1 = new Thread(threadA); // Runnable interface is implemented by E and F classes, so we need to create Thread objects to run them.
        Thread t2 = new Thread(threadB);*/ // works as well

        //anoher way:

        Runnable threadA = new E();
        Runnable threadB = new F();

        Thread t1 = new Thread(threadA);
        Thread t2 = new Thread(threadB);

        t1.start();
        t2.start();
    }
}
