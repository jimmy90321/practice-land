
import java.util.Arrays;

public class Next_Greater_Element {

    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result = new int[findNums.length];
        for (int i = 0; i < findNums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (findNums[i] != nums[j]) {
                    continue;
                }
                if ((j + 1) == nums.length) {
                    result[i] = -1;
                    break;
                }
                int n = 1;
                while ((j + n) < nums.length) {
                    if (nums[j + n] > nums[j]) {
                        result[i] = nums[j + n];
                        break;
                    }
                    n++;
                }
                result[i] = -1;
            }
        }
        return result;
    }
}
