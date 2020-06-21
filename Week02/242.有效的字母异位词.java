import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
        // int[] countArray = new int[26];
        // int sLength = s.length();
        // for (int i = 0; i < sLength; i++) {
        // countArray[s.charAt(i) - 'a']++;
        // countArray[t.charAt(i) - 'a']--;
        // }
        // for (int i = 0; i < countArray.length; i++) {
        // if (countArray[i] != 0) {
        // return false;
        // }
        // }
        // return true;
        // Map<Character, Integer> countMap = new HashMap<>();
        // int sLength = s.length();
        // for (int i = 0; i < sLength; i++) {
        // Character item = s.charAt(i);
        // countMap.put(item, countMap.getOrDefault(item, 0) + 1);
        // Character tItem = t.charAt(i);
        // countMap.put(tItem, countMap.getOrDefault(tItem, 0) - 1);
        // }
        // for (Integer counInteger : countMap.values()) {
        // if (counInteger != 0) {
        // return false;
        // }
        // }
        // return true;
    }
}
// @lc code=end
