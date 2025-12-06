/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
// semicolons : 1
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(Arrays.stream(strs).collect(Collectors.groupingBy(s -> Arrays.stream(s.split("")).sorted().collect(Collectors.joining()))).values());
    }
}
// @lc code=end

