class Main {
    
    public void show(){
        System.out.println("Main show() method");
    }

    static class Inner{  //static can only be used with inner class, not with outer class, because static is used to access the members of the class without creating object of the class, but we cannot create object of outer class without creating object of inner class, so we cannot use static with outer class
        public void show1(){
            System.out.println("Inner show1() method");
        }
    }
}

public class inner_class{
    public static void main(String args[]){

        Main obj = new Main(); // Creating object of Main class
        obj.show(); // Calls Main's show() method


        //Main.Inner obj1 = obj.new Inner(); // Creating object of Inner class using object of Main class
//if no static used then we need to create object of Main class to create object of Inner class

//if static used then we don't need to create object of Main class to create object of Inner class:

        Main.Inner obj1 = new Main.Inner(); // Creating object of Inner class using object of Main class
        obj1.show1(); // Calls Inner's show1() method


    }
}