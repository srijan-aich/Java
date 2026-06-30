class Anonymous{
    void display() {
        System.out.println("This is an anonymous object.");
    }
}

public class anonymousObject{
    public static void main(String[] args) {

        new Anonymous().display(); // anonymous object is created and display() method is called.

    }
}