public class while
 {
    public static void main(String[] args) {
        
        int i = 1; // 1. Initialization (Where to start)

        while (i <= 5) { // 2. Condition (When to stay in the loop)
            
            System.out.println("Hello " + i);
            
            i++; // 3. Increment (Moving forward to avoid an infinite loop)
        }

        System.out.println("Loop finished! Final value of i is: " + i);
    }
} 