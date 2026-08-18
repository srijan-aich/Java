class A{

    public void show(){
        System.out.println("Hi I am in class A");
    }
}
class B extends A{
    public void show(){
        System.out.println("Hi I am in class B");
    }
}

public class method_overriding{
    
    public static void main(String[] args){
        B obj = new B();
        obj.show();
    } 
}

