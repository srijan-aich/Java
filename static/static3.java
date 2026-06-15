//static block

class Mobile{
    String brand;
    int price;
    static String name;

    public Mobile(){
        brand = "Unknown";
        price = 0;
        System.out.println("Constructor called"); //everytime you create a object
    }

    static {
        System.out.println("Static block called"); // only called once
        name = "Phone"; //initializing static variable in static block
    }

    public void show(){
        System.out.println("Brand: " + brand + ", Price: " + price + ", Name: " + name); //can access both static and non-static variables in a non-static method
    }

    public static void show1(Mobile obj){
        System.out.println("Brand: " + obj.brand + ", Price: " + obj.price + ", Name: " + name); //can access both static and non-static variables in a non-static method
    }
}

public class static3{
    public static void main(String[] args) throws ClassNotFoundException { 
       
       Class.forName("Mobile"); // to load the class and execute the static block without creating an object
       
       
        /*Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1999;
        Mobile.name = "SmartPhone"; 

        Mobile obj2 = new Mobile();*/
    } 
}

// static block executed first before the constructor and only once
// because class is loaded first - static block - create object - constructor called

// self note - learn about exception later
