public class relational {
    public static void main(String args[]) {
        int x = 6;
        int y = 9;

        // 1. Comparison Operators
        boolean isGreater = x > y;   // Greater than (false)
        boolean isLess = x < y;      // Less than (true)
        boolean isGreaterEqual = x >= y; // Greater than or equal to (false)
        boolean isLessEqual = x <= y;    // Less than or equal to (true)

        // 2. Equality Operators
        boolean isEqual = x == y;    // Equal to (false) - Note the DOUBLE equal sign!
        boolean isNotEqual = x != y; // Not equal to (true)

        // 3. Upgraded Example: Using these with variables
        double price = 199.99;
        double balance = 200.00;
        
        // Checking if we can afford something
        boolean canPurchase = balance >= price; 

        System.out.println("Is x equal to y? " + isEqual);
        System.out.println("Can I afford the item? " + canPurchase);
        
        // You can also compare characters (based on Unicode values!)
        char a = 'A'; // Unicode 65
        char b = 'B'; // Unicode 66
        System.out.println("Is 'A' less than 'B'? " + (a < b));
    }
}