class car{
    String name;
    int speed;
    
    void drive(){
    System.out.println(name + " is driving at " + speed + " km/h");
    }
}

public class class_object {
    public static void main(String args[]) {
        car c1 = new car();
        c1.name = "BMW";
        c1.speed = 200;
        c1.drive();
    }
} 