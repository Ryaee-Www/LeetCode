import java.util.HashSet;
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int thisNum : nums){
            if(!numSet.contains(thisNum)){
                numSet.add(thisNum);
            }else{
                return true;
            }
        }
        return false;
    }
}
