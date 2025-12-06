/*
 * @lc app=leetcode id=38 lang=java
 *
 * [38] Count and Say
 */

// @lc code=start
// semicolons : 1
class Solution { public String countAndSay(int n) { return Stream.iterate("1", s -> java.util.regex.Pattern.compile("(\\d)\\1*").matcher(s).results().map(m -> m.group().length() + m.group().substring(0, 1)).collect(Collectors.joining())) .limit(n) .reduce((a, b) -> b) .orElse("1"); } }
// @lc code=end

