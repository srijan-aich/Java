class Student {
    int id;
    String name;
    int marks;
    }

public class student_arr {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Srijan";
        s1.marks = 90;

        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Satyarth";
        s2.marks = 85;

        Student s3 = new Student();
        s3.id = 103;
        s3.name = "Shivam";
        s3.marks = 78;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].id + " - " + students[i].name + " : " + students[i].marks);
        }
    }
}