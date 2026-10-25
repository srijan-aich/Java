import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import javax.xml.transform.Source;

public class CollectionExample {
    public static void main(String[] args) {
        
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        //System.out.println(nums);

        for( int n : nums) {
            System.out.println(n);
        } 

    }
}