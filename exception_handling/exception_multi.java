
public class exception_multi {
    public static void main(String[] args) {
        
        int i = 2;
        int j = 0;
        int nums[] = new int[5];
       // String s = null;


        try{
            j = 18/i; // checks this frist , normal order of code ....
            //System.out.println(s.length()); will give NullPointerException
            System.err.println(nums[1]); // prints 0 first
            System.out.println(nums[5]); // then prints exception ..stay in limit
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot Divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in limit");
        }
        catch(Exception e) // This handles every possible exception there is, always use this at last...
        {
            System.out.println("Something went wrong" + e);
        }


        System.out.println(j); // prints 9
        System.out.println("bye"); //...

    }
}
