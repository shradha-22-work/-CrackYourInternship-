import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicatesfromsortedarray {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int index = 0;
        for (int num : set) {
            nums[index++] = num;
        }
        return set.size();
    }
}
