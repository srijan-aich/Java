import java.util.HashSet;
import java.util.Set;

public class SetExp {
    public static void main(String[] args) {
        
        Set<Integer> nums = new HashSet<Integer>(); // not sorted and no duplicates
        nums.add(29);
        nums.add(24);
        nums.add(31);
        nums.add(44);        
        nums.add(50);

        //System.out.println(nums);

        for( int n : nums) {
            System.out.println(n);
        } 

    }
}