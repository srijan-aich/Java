class arithmetic {
    public static void main(String args[]) {
        int num1 = 7;
        int num2 = 5;

        // 1. Basic Arithmetic Operators
        int addition = num1 + num2;      // 12
        int subtraction = num1 - num2;   // 2
        int multiplication = num1 * num2;// 35
        int division = num1 / num2;      // 1 (Integer division drops decimals)
        int remainder = num1 % num2;     // 2 (The 'Modulo' operator)

        // 2. Shorthand Operators (Assignment)
        int num = 7;
        num += 1; // Same as num = num + 1; (num is now 8)
        num -= 2; // Same as num = num - 2; (num is now 6)

        // 3. Increment & Decrement (The Tricky Part)
        // Post-increment: FETCH value first, THEN increment
        int n1 = 7;
        int resultPost = n1++; 
        // resultPost gets 7, then n1 becomes 8.

        // Pre-increment: INCREMENT first, THEN fetch value
        int n2 = 7;
        int resultPre = ++n2; 
        // n2 becomes 8, then resultPre gets 8.

        System.out.println("Modulo Result: " + remainder);
        System.out.println("Post-increment Result: " + resultPost);
        System.out.println("Pre-increment Result: " + resultPre);
    }
}