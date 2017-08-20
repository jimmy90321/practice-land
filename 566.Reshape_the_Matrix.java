
import java.util.ArrayList;
import java.util.List;


public class Reshape_the_Matrix {
public int[][] matrixReshape(int[][] nums, int r, int c) {
         if (nums.length*nums[0].length != r*c) return nums;  
         int[][] newNums =  new int[r][c];  
         List<Integer> numList = new ArrayList<>();
         int index = 0;
         for(int i = 0;i<nums.length;i++){
             for(int j = 0 ;j<nums[i].length;j++){
                 numList.add(nums[i][j]);
             }
         }
         
         for(int i = 0;i<r;i++){
             for(int j = 0;j<c;j++){
                 newNums[i][j] = numList.get(index);
                 index++;
             }
         }
         return newNums;
    }
}
