public class jagged_arr {
    public static void main(String[] args) {
        int nums[][] = new int[3][]; // Declare a jagged array (array of arrays) with 3 rows and variable number of columns
        nums[0] = new int[2]; // Initialize the first row with 2 columns
        nums[1] = new int[3]; // Initialize the second row with 3 columns
        nums[2] = new int[4]; // Initialize the third row with 4 columns

        for(int i = 0; i < nums.length; i++) { 
            for(int j = 0; j < nums[i].length; j++) { 
                nums[i][j] = (int)(Math.random() * 100); // Initialize the jagged array with random integers between 0 and 99
            }
        }


        for(int n[] : nums) { // Use a enhanced for loop to iterate through the 2D array
            for(int m : n) {
                System.out.print(m + " "); // Print each element in the current row
            }
            System.out.println(); // Print a new line after each row
        }
    }
}