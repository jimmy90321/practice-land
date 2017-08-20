
public class Max_Consecutive_Ones {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                count++;
                result = Math.max(count, result);
            }
            else{
                count = 0;
            }
        }
        return result;
    }
}
