public class arr_in_objs {
    public static void main(String[] args) {

       int nums[] = new int[6];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;  
        nums[3] = 40;
        // rest values are 0 by default

        for(int i = 0; i < nums.length; i++) { 
            System.out.println(nums[i]);
        }
        
        /*for(int i = 0; i < 6; i++) {
            System.out.println(nums[i]);
        }*/ 

       /*for(int i = 0; i < 7; i++) {
            System.out.println(nums[i]);
        }*/ // ArrayIndexOutOfBoundsException: 6 , runs nut exception ...

        


    }
}