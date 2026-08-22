abstract class Car{ // abstract class - cannot be instantiated, can have abstract methods and concrete methods

    public abstract void drive(); // abstract method - no body, only declaration
    public abstract void nitro(); // abstract method - no body, only declaration

    public void music(){ // concrete method - has body
        System.out.println("play music");
    }

}

abstract class Bmw extends Car{  // abstract class - cannot be instantiated, can have abstract methods and concrete methods but not compulsory to implement abstract methods of parent class

//class Bmw extends Car{  compulsory to implement abstract methods of parent class if child class is not abstract

    public void drive(){ // implementing abstract method
        System.out.println("Bmw is driving");
    }

}

class UlraMode extends Bmw{ // concrete class - can be instantiated, must implement all abstract methods of parent class

    public void nitro(){ // implementing abstract method
        System.out.println("UlraMode is using nitro");
    }

}


public class abstract_{ 
    public static void main(String args[]){

        //Car obj = new Car(); // cannot instantiate abstract class
        //Car obj1 = new Bmw(); // cannot instantiate abstract class
        Car obj1 = new UlraMode(); // can instantiate concrete class
        obj1.drive(); // Calls Bmw's drive() method
        obj1.music(); // Calls Car's music() method
        obj1.nitro(); // Calls UlraMode's nitro() method

    }
}