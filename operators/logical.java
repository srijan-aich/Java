public class logical {
    public static void main(String args[]) {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        // 1. AND Operator (&&) - Returns true ONLY if BOTH are true
        boolean result1 = x > y && a < b; // true AND true -> true
        boolean result2 = x > y && a > b; // true AND false -> false

        // 2. OR Operator (||) - Returns true if AT LEAST ONE is true
        boolean result3 = x < y || a < b; // false OR true -> true
        boolean result4 = x < y || a > b; // false OR false -> false

        // 3. NOT Operator (!) - Reverses the result (true becomes false)
        boolean result5 = !(x > y); // NOT (true) -> false

        // Printing results
        System.out.println("Logical AND (&&): " + result1);
        System.out.println("Logical OR (||): " + result3);
        System.out.println("Logical NOT (!): " + result5);

    }
}