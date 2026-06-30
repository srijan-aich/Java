class Humans{
    private int age;
    private String name;

    public Humans() {  // constructor, class name is used as method name and it does not have any return type.
        age = 18; // default value of age is set to 18 and name is set to "John Doe" when an object of Humans class is created.
        name = "John Doe";
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


public class constructor{
    public static void main(String[] args) {
        Humans obj = new Humans(); // when an object of Humans class is created, the constructor is called and default values of age and name are set to 18 and "John Doe" respectively.
        System.out.println("Age : " + obj.getAge() + ", Name : " + obj.getName());
        //obj.age = 25;
        //obj.name = "John";
        obj.setAge(25);
        obj.setName("Jane");
        //System.out.println("Age : " + obj.getAge() + ", Name : " + obj.getName());
    }
}