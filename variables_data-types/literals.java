public class literals {
    public static void main(String args[]) {
        
        // 1. Integer Literals
        int decimal = 100;          // Standard base 10
        int binary = 0b101;         // Binary (5 in decimal)
        int hex = 0x7E;             // Hexadecimal (126 in decimal)
        int withUnderscores = 1_00_000; // Easy to read 100,000
        long hugeNumber = 9000000000L; // 'L' makes it a Long literal

        // 2. Floating-Point Literals
        float pi = 3.14f;           // 'f' is mandatory for float
        double weight = 75.5;       // Standard double

        // 3. Character & String Literals
        char letter = 'A';          // Single quotes for char
        char unicodeChar = '\u0041'; // Unicode for 'A'

        String greeting = "Hello World"; // Double quotes for String 

        // 4. Boolean Literals
        boolean isJavaFun = true;
        boolean isBored = false;

// Literal is a fixed value that is directly represented in the code. It can be of various types such as integer, floating-point, character, string, or boolean.

    }
}