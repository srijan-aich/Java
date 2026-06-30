class Humanoids{
    private int age;
    private String name;

    public Humanoids() {  // default constructor.
        age = 18; 
        name = "John Doe";
    }

// Java auto creates a default constructor.


    public Humanoids(String name) { //
        this.name = name;
    }

    public Humanoids(int a, String n) { // parameterized constructor.
        age = a;
        name = n;
    }

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

public class default_para_cons{
    public static void main(String[] args) {
        Humanoids obj = new Humanoids(); // when an object of Humanoids class is created, the constructor is called and default values of age and name are set to 18 and "John Doe" respectively.
        Humanoids obj2 = new Humanoids(20, "Joseph");
        Humanoids obj3 = new Humanoids("Jack");
        System.out.println("Age : " + obj.getAge() + ", Name : " + obj.getName());
        System.out.println("Age : " + obj2.getAge() + ", Name : " + obj2.getName());
        System.out.println("Age : " + obj3.getAge() + ", Name : " + obj3.getName());
        //obj.age = 25;
        //obj.name = "John";
        obj.setAge(25);
        obj.setName("Jane");
        //System.out.println("Age : " + obj.getAge() + ", Name : " + obj.getName());
    }  
}