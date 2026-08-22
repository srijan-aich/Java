class Parent {

    public void show(){
        System.out.println("Parent show() method");
    }
}

class Child extends Parent{

    public void show2(){
        System.out.println("Child show2() method");
    }
}

public class up_downcasting{
    public static void main(String args[]){

        Parent obj1 = (Parent) new Child(); // Upcasting
        obj1.show(); // Calls Parent's show() method , btw can't call Child's show2() method because obj1 is of type Parent and Parent class doesn't have show2() method

// here Parent doesn't know a Child exist...

        Child obj2 = (Child) obj1; // Downcasting
        obj2.show2(); // Calls Child's show2() method

    }
}

