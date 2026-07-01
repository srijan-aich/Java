class Calc{

    public int add(int a , int b)
    {
        return a+b;
    }

    public int sub(int a , int b)
    {
        return a-b;
    }
}

public class inheritance{
    public static void main(String[] args) {
        VeryAdvCalc c = new VeryAdvCalc(); // we don't write Calc because it will only give access to Calc methods not AdvCalc methods. AdvCalc is Calc as extends. 
        int r1 = c.add(10, 20);
        int r2 = c.sub(20, 10);
        int r3 = c.multi(10, 20);
        int r4 = c.div(20, 10);
        double r5 = c.pow(4, 2);

        System.out.println("Addition : "+r1);
        System.out.println("Subtraction : "+r2);
        System.out.println("Multiplication : "+r3);
        System.out.println("Division : "+r4);
        System.out.println("Power : "+r5);

    }
}