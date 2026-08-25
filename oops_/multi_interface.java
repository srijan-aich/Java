// class - class - extends
// interface - class - implements
// interface - interface - extends

interface Girl{

    void sees();
    void speaks();
}                       //This is just a example, pls don't take it seriously, I just couldn't think of any other class names...

interface Boy{

    void runs();
    void speaks();
}

interface Man_Woman extends Girl, Boy{  //Both


}

class Homo_sapiens implements Man_Woman {

    public void runs() {
        System.out.println("Homo sapiens runs");
    }

    public void speaks() {
        System.out.println("Homo sapiens speaks");
    }

    public void sees() {
        System.out.println("Homo sapiens sees");
    }
}


public class multi_interface {
    public static void main(String[] args) {

        Man_Woman obj = new Homo_sapiens();
        obj.speaks();
        obj.sees();
        obj.runs();
       
    };  
}
