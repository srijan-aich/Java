public class exception {
    public static void main(String[] args) {
        
        int i = 18;
        int j = 2;

        try{
            j = i/j;
        }
        catch(Exception e)
        {
            System.out.println("Something went Wrong");
        }

        System.out.println(j); 
        System.out.println("bye");

    }
}
