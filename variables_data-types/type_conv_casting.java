public class Hello 
{
    public static void main(String args[]) 
    {
        // --- Example 1: Integer to Byte (The Wrap-Around) ---
        int a = 257;
        byte k = (byte) a; 
        // 257 % 256 = 1. The extra bits are chopped off.
        System.out.println(k);

        // --- Example 2: Float to Int (The Decimals Loss) ---
        float f = 5.6f;
        int t = (int) f;   
        // The .6 is simply removed. It does NOT round to 6.
        System.out.println(t);

        //type promotion

        byte b = 10;
        byte c = 30;

        // When we perform arithmetic operations on byte, short, or char, Java promotes them to int before performing the operation. This is called type promotion.
        int z = b + c; // The result is promoted to int
        // even if it is coming 40 which is within the byte range, it is still promoted to int because of the rules of type promotion in Java.
        System.out.println(z);

        int d = b * c; // The result is promoted to int, as byte can overflow.

        System.out.println(d);


    }
}