public class forloop {
    public static void main(String args[]) {
        
        // Outer loop: Runs 5 times (for 5 days)
        for (int i = 1; i <= 5; i++) {
            System.out.println("DAY " + i);

            // Inner loop: Runs 9 times (for 9 hours in each day)
            for (int j = 1; j <= 9; j++) {
                // Logic: j+8 starts the time at 9 AM (1+8=9)
                // Logic: j+9 ends the slot (1+9=10)
                System.out.println("   " + (j + 8) + " Am " + " - " + (j + 9) + " Pm");
            }
            
            System.out.println(); // Adds a blank line between days for clarity
        }
    }
}