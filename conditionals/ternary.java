public class ternary
{
    public static void main(String a[]) 
    {
        int n = 4;
        int result = 0;

        // The commented out if-else version:
        // if(n%2==0)
        //     result = 10;
        // else
        //     result = 20;

        // The Ternary Operator version:
        // condition ? value_if_true : value_if_false;
        result = n % 2 == 0 ? 10 : 20;

        System.out.println(result);
    }
}