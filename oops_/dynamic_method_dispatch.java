class A{
    public void show(){
        System.out.println("A's show() method");
    }
}

class B extends A{
    public void show(){
        System.out.println("B's show() method");
    }
}

class C extends A{
    public void show(){
        System.out.println("C's show() method");
    }
}

public class dynamic_method_dispatch {
    public static void main(String args[]){
        
        A obj = new A();
        obj.show(); // Calls A's show() method

        obj = new B();
        obj.show(); // Calls B's show() method

        obj = new C();
        obj.show(); // Calls C's show() method

        // this is called dynamic method dispatch 
        //but here this is also an example of runtime polymorphism, shows how behavior changes at runtime based on the object type.
    }
}