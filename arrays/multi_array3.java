public class multi_array3 {
    public static void main(String[] args) {
        int nums[][] = new int[3][4]; // Declare a 2D array of integers with 3 rows and 4 columns

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                nums[i][j] = (int)(Math.random() * 100); // Initialize the 2D array with random integers between 0 and 99
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " "); // Print the elements of the 2D array
            }
            System.out.println(); // Print a new line after each row
        }

        for(int n[] : nums) { // Use a enhanced for loop to iterate through the 2D array
            for(int m : n) {
                System.out.print(m + " "); // Print each element in the current row
            }
            System.out.println(); // Print a new line after each row
        }
    }
}