class Main {
    
    public void show(){
        System.out.println("Main show() method");
    }

    class Inner{
        public void show1(){
            System.out.println("Inner show1() method");
        }
    }
}

public class inner_class{
    public static void main(String args[]){


        Main.Inner obj1 = obj.new Inner(); // Creating object of Inner class using object of Main class
        obj1.show1(); // Calls Inner's show1() method


    }
} 