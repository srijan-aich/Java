class Hello 
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


    }
}