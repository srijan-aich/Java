class Calculator {
    // Method 1: Adds three integers
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // Method 2: Adds two integers
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // Method 3: Adds two doubles (Notice: parameters must be different!)
    public double add(double n1, double n2) {
        return n1 + n2;
    }
}

public class Demo {
    public static void main(String args[]) {
        Calculator obj = new Calculator();

        int res1 = obj.add(3, 4, 5);    // Calls Method 1
        int res2 = obj.add(10, 20);     // Calls Method 2
        double res3 = obj.add(5.5, 2.3); // Calls Method 3

        System.out.println("Three ints: " + res1);
        System.out.println("Two ints: " + res2);
        System.out.println("Two doubles: " + res3);
    }
}

//same name methods but different parameters is called method overloading.
//if we only do obj.add(10,20); then it will call method 2 only not one
/*but if we don't write method 2 and run 2 int then it will give error 
because it will not find method with 2 int parameters. 
so we have to write method 2 to run the code without error.*/
