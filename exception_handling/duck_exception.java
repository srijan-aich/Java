class A{
    public void show() throws ClassNotFoundException
    { 

        Class.forName("A");

    }
}


public class duck_exception {
    public static void main(String[] args) {
        
        A obj = new A();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e)
        {
           e.printStackTrace();
           System.out.println("Class not found exception");
        }
        System.out.println("Class found");

    }
}
