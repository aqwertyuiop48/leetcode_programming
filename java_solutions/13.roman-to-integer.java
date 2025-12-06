/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
// semicolons : 1
class Solution {
public int romanToInt(String s) { return (int)java.util.stream.IntStream.iterate(s.length() - 1, i -> i >= 0, i -> i - 1).boxed().reduce(new Object[]{0, 0, Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000)}, (state, i) -> new Object[]{(int)state[0] + (4 * (int)((Map<Character,Integer>)state[2]).get(s.charAt(i)) < (int)state[0] ? -(int)((Map<Character,Integer>)state[2]).get(s.charAt(i)) : (int)((Map<Character,Integer>)state[2]).get(s.charAt(i))), (int)state[0] + (4 * (int)((Map<Character,Integer>)state[2]).get(s.charAt(i)) < (int)state[0] ? -(int)((Map<Character,Integer>)state[2]).get(s.charAt(i)) : (int)((Map<Character,Integer>)state[2]).get(s.charAt(i))), state[2]}, (a, b) -> b)[0]; }
}
// @lc code=end

