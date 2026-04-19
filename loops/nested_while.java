public class nested_while {
    public static void main(String[] args) {
        int week = 1; // Outer loop counter

        while (week <= 3) {
            System.out.println("Week: " + week);
            
            int day = 1; // Inner loop counter (Reset every time outer loop runs)
            while (day <= 5) {
                System.out.println("  Day: " + day);
                day++; // Update inner counter
            }
            
            week++; // Update outer counter
            System.out.println("----------------"); // Visual separator
        }
    }
}