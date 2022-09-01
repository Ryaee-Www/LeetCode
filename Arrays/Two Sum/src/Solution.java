public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0,0};
        if(nums.length == 2){
            result[1] = 1;
            return result;
        }else{
            int thisNum;
            int theOtherNum;
            for(int i = 0; i < nums.length; i ++){
                thisNum = nums[i];
                for (int j = 0; j < nums.length; j ++){
                    theOtherNum = nums[j];
                    if(i!=j){
                        if(thisNum + theOtherNum == target){
                            result[0] = i;
                            result[1] = j;
                            return result;
                        }
                    }
                }
            }
        }
        return result;
    }

}
