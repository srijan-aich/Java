class Mobile{
    String brand;
    int price;
    static String name;
    

    public void show(){
        System.out.println("Brand: " + brand + ", Price: " + price + ", Name: " + name); //can access both static and non-static variables in a non-static method
    }

    public static void show1(Mobile obj){
        System.out.println("Brand: " + obj.brand + ", Price: " + obj.price + ", Name: " + name); //can access both static and non-static variables in a non-static method
    }
}

public class static2{
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1999;
        Mobile.name = "SmartPhone"; //accessing static variable through the class name

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1999;
        Mobile.name = "SmartPhone"; //accessing static variable through the class name

        obj1.show(); //prints the details of the first mobile object
        Mobile.show1(obj2); //prints the details of the second mobile object

        //Mobile.show(); //error: cannot call a static method that accesses non-static variables
        //obj1.show(); //error: cannot call a static method that accesses non-static variables
        //Mobile.show1(); //error: cannot call a non-static method from a static context 
        //Mobile.show1(obj1); , public static void show1(Mobile obj) { System.out.println("Brand: " + obj.brand + ", Price: " + obj.price + ", Name: " + name); } 
        //can call a non-static method from a static context by passing an instance of the class as an argument
    }
}