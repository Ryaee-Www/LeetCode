import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 0){
            return result;
        }
        HashMap<String,List<String>> record = new HashMap<>();
        for (String i : strs) {
            //Create char array and sort; record with map
            //Assemble result
        }
        return result;
    }

}