public class ThreeD_arr {
    public static void main(String[] args) {

        // 3D array: 2 layers, 3 rows, 4 columns
        int nums[][][] = new int[2][3][4];

        // Fill array
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                for(int k = 0; k < nums[i][j].length; k++) {
                    nums[i][j][k] = (int)(Math.random() * 100);
                }
            }
        }

        // Print using enhanced for loop
        for(int n[][] : nums) {
            for(int m[] : n) {
                for(int o : m) {
                    System.out.print(o + " ");
                }
                System.out.println(); // new row
            }
            System.out.println(); // new layer
        }
    }
}