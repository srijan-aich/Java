class Human{
    private int age;
    private String name;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}


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