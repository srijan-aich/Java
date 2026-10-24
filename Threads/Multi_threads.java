class A extends Thread{

    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("Thread A: "+i);
        }
    }
}

class B extends Thread{

    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("Thread B: "+i);
        }
    }
}
public class Multi_threads {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();

        threadA.start();
        threadB.start();
    }
}