

//final class Calc{ //no one can extend this class because it is final class
class Calc{

    //public final void show(){ //no one can override this method because it is final method
    public void show(){
        System.out.println("Calc's show() method");
    }
}

class AdvCalc extends Calc{
    public void show1(){
        System.out.println("AdvCalc's show1() method");
    }
}

public class final_keyword{
    public static void main(String args[]){

        /*int a = 10;
        a = 20; // we can change the value of a because it is not final
        System.out.println(a); will print 20

        final int b = 10;
        b = 20; // we cannot change the value of b because it is final
        System.out.println(b); will give error because b is final and we cannot change the value*/
        
        Calc obj = new Calc();
        obj.show(); // Calls Calc's show() method

        AdvCalc obj1 = new AdvCalc();
        obj1.show1(); // Calls AdvCalc's show1() method
        obj1.show(); // Calls Calc's show() method because AdvCalc is extending Calc class and it is inheriting the show() method from Calc class
    }
}