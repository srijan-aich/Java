class C extends Thread{

    public void run(){
        for(int i=0;i<20;i++){
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

class D extends Thread{

    public void run(){
        for(int i=0;i<20;i++){
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
public class threadpriority_sleep {
    public static void main(String[] args) {
        C threadA = new C();
        D threadB = new D();

        threadA.setPriority(Thread.MIN_PRIORITY); // 1 //in this code thread have less effect
        threadB.setPriority(Thread.MAX_PRIORITY); // 10 // as same timing for both..

        threadA.start();
        threadB.start();
    }
}
