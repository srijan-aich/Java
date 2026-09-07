
class SrijanException extends Exception{

    public SrijanException(String str){

        super(str);

    }
}

public class custom_excep {
    public static void main(String[] args) {
        
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0){
            throw new SrijanException("I don't want to print zero"); //this will print the catch...
            }
        }
        catch(SrijanException e)
        {
            j = 18;
            System.out.println(e.getMessage());
            System.out.println("Default Output:");
        }

        System.out.println(j); 
        System.out.println("bye");

    }
}