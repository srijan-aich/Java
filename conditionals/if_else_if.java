public class if_else_if {
    public static void main(String[] args) {
        
        int x = 8;
        int y = 12;
        int z = 15;

        // The goal: Find the greatest of 3 numbers
        if (x > y && x > z) {
            System.out.println("X is the greatest: " + x);
        } 
        else if (y > z) { 
            System.out.println("Y is the greatest: " + y);
        }
        else {
            System.out.println("Z is the greatest: " + z);
        }
    }
} 
