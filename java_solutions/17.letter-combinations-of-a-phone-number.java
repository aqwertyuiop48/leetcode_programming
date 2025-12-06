/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
// semicolons : 1
class Solution { public List<String> letterCombinations(String digits) { return digits.isEmpty() ? List.of() : digits.chars() .mapToObj(c -> Map.of('2',"abc",'3',"def",'4',"ghi",'5',"jkl",'6',"mno",'7',"pqrs",'8',"tuv",'9',"wxyz").getOrDefault((char)c, "")) .filter(s -> !s.isEmpty()) .map(s -> s.chars().mapToObj(ch -> String.valueOf((char)ch)).toList()) .reduce(List.of(""), (acc, chars) -> acc.stream().flatMap(p -> chars.stream().map(ch -> p + ch)).toList()); } }
// @lc code=end

