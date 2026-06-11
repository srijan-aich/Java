class Student{
    String name;
    int id;
    static String college = "ABC College"; //static variable, shared by all instances of the Student class
}

public class static1{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(Student.college); //prints "ABC College", accessed through the class name

        System.out.println(s1.college); //prints "ABC College", accessed through an instance
        System.out.println(s2.college); //prints "ABC College", accessed through an instance
// only one copy exists, common for all instances of the class and use class name to access it, saves memeory 

        s1.college = "XYZ College"; //modifies the static variable through an instance, but it affects all instances
        System.out.println(Student.college); //prints "XYZ College", accessed through the class name
    }
}