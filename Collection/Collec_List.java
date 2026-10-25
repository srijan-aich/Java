import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collec_List {
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(2);
        nums.add(8);
        nums.add(5);
        nums.add(9);
        
        System.out.println(nums.indexOf(5)); // Output: 3
        System.out.println(nums.get(2)); // Output: 8

    }
}