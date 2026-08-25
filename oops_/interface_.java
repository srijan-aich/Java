
interface Show { //interface is a collection of abstract methods. It is a blueprint of a class. It has no method body, only method signature. The methods in an interface are by default public and abstract.

    int a = 10; // variables in interface are by default public, static and final
    String name = "Interface Example"; // variables in interface are by default public, static and final
    void show();
    void config();

}

class ShowImpl implements Show { // Implementing means providing the body of the methods defined in the interface


    public void show() {
        System.out.println("Show method implementation");
    }

    
    public void config() {
        System.out.println("Config method implementation");
    }

}

public class interface_ {
    public static void main(String[] args) {

        Show obj;
        obj = new ShowImpl(); // Creating an object of the class that implements the interface
        obj.show();
        obj.config();
        
        System.out.println("Value of a: " + Show.a); // Accessing the variable of the interface
        System.out.println("Value of name: " + Show.name); // Accessing the variable of the interface

    }
}
