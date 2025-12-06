/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
// semicolons : 1
class Solution{
    public String longestCommonPrefix(String[] strs){
        return IntStream.rangeClosed(0,Arrays.stream(strs).mapToInt(String::length).min().getAsInt()).mapToObj(i->Arrays.stream(strs).map(s->s.substring(0,i)).collect(Collectors.toSet()).size()==1?i:0).max(Integer::compare).map(i->strs[0].substring(0,i)).orElse("");
    }
}
// @lc code=end

