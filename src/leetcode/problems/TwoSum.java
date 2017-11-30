package leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum two = new TwoSum();
        int[] arrayInt = {2, 7, 11, 15};
        int [] result = two.twoSum(arrayInt, 26);
        System.out.println(result[0] + " " + result[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapResult = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complements = target - nums[i];
            if(mapResult.containsKey(complements)){
                return new int[] {mapResult.get(complements), i};
            }
            mapResult.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
