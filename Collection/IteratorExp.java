import java.util.TreeSet;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExp {
    public static void main(String[] args) {
        
        Collection<Integer> nums = new TreeSet<Integer>(); // not sorted and no duplicates
        nums.add(29);
        nums.add(24);
        nums.add(31);
        nums.add(44);        
        nums.add(50);

        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());

        }
    }
}