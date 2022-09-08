import java.util.HashMap;
// nums = [2,7,11,15], target = 9
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // to be returned
        int[] result = new int[2];
        int difference = 0;

        // Create map O(1)
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // iterate through array
        for(int i=0; i<nums.length; i++){
            // target minus the element we are currently on 
            //   7         9    -   2      Iteration 1
            //   2         9    -   7      Iteration 2
            difference = target - nums[i];

            // if the map contains the "difference" as an element 
            if(map.containsKey(difference)){
                // add 
                result[0] = i;     // i = 1
                result[1] = map.get(difference);   // 0

                // if you found the combination, return result you are done.
                return result;
            }
            // if map does not contain key, add it
            // otherwise add to map to be checked next iteration
            // key = 7
            // value = element index
            // key =     2 , 0
            map.put(nums[i], i);
        }
        return result;
    }
}