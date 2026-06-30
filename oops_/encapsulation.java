class Human{
    private int age;
    private String name;

    public void setAge(int a) { //int age
        age = a; // this.age = age; should be used.
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {  // if String name is used instead of String n
        name = n;   // this.name = name; should be used to avoid ambiguity. 
    }

    public String getName() {
        return name;
    }
}

// getter and setter methods are used to access private variables of a class. We can use abc-xyz instead of getAge and setAge but it is a convention to use get and set as prefix for getter and setter methods respectively.


public class encapsulation{
    public static void main(String[] args) {
        Human obj = new Human();
        //obj.age = 25;
        //obj.name = "John";
        obj.setAge(25);
        obj.setName("John");
        System.out.println("Age : " + obj.getAge() + ", Name : " + obj.getName());
    }
}