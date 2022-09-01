import java.util.HashMap;
public class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> sMap = new HashMap<>();
        makeMap(s,sMap);
        HashMap<Character,Integer> tMap = new HashMap<>();
        makeMap(t,tMap);
        return sMap.equals(tMap);
    }
    public void makeMap (String s, HashMap<Character, Integer> sMap){
        for (int i = 0; i < s.length(); i ++){
            char thisChar = s.charAt(i);
            if(!sMap.containsKey(thisChar)){
                sMap.put(thisChar,1);
            }else{
                sMap.replace(thisChar,sMap.get(thisChar) + 1);
            }
        }
    }
}
