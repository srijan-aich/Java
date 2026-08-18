class A extends Object {
    public A() {
        super();
        System.out.println("A's constructor");
    }

    public A(int n) {
        super();
        System.out.println("A's constructor with parameter: " + n);
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("B's constructor");
    }

    public B(int n) {
        this();
        System.out.println("B's constructor with parameter: " + n);
    }
}

public class Super_this {
    public static void main(String[] args) {
        B obj = new B(10);
    }
}
