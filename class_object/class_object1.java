class sumation {

    public int add(int num1, int num2){

        int r = num1 + num2;
        return r;

    }

}

public class class_object1{
    public static void main(String args[]) {

        int num1 = 20;
        int num2 = 30;

        sumation sum = new sumation();
        int result = sum.add(num1 , num2);

        System.out.println(result);

       
    }
}