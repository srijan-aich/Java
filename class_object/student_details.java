class student{
    String name;
    int age;

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

}

public class student_details {
    public static void main(String args[]){

        student s1 = new student();
        s1.name = "Srijan";
        s1.age = 19;
        s1.display();
    }
}