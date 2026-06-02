
// Enhanced for loop used.


class Student {
    int id;
    String name;
    int marks;
    }

public class student_arr2 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Srijan";
        s1.marks = 95;

        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Arthur";
        s2.marks = 85;

        Student s3 = new Student();
        s3.id = 103;
        s3.name = "Michael";
        s3.marks = 75;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for( Student s : students){
            System.out.println(s.id + " - " + s.name + " : " + s.marks);
        }
    } 
}