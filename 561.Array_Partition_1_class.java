
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_Partition_1_class {

    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}
