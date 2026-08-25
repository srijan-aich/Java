interface Computer {

    void code();
}

class Laptop implements Computer{

    public void code() {
        System.out.println("Coding on Laptop");
    }
}

class Desktop implements Computer{

    public void code() {
        System.out.println("Coding on Desktop");
    }
}

class Developer {

    void develop(Computer obj) {
        obj.code();
    }
}

public class interface__ {
    public static void main(String[] args) {

        Computer obj1 = new Laptop();
        Computer obj2 = new Desktop();

        Developer dev = new Developer();
        dev.develop(obj1);
        dev.develop(obj2);
    }
}
