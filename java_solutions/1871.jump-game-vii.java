/*
 * @lc app=leetcode id=1871 lang=java
 *
 * [1871] Jump Game VII
 */

class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        return s.charAt(s.length() - 1) != '0' ? false : java.util.Optional.of(new Object[]{new boolean[s.length()], new int[]{0}}).filter(st -> (((boolean[])st[0])[0] = true) && java.util.stream.IntStream.range(1, s.length()).allMatch(i -> (((int[])st[1])[0] += i >= minJump && ((boolean[])st[0])[i - minJump] ? 1 : 0) >= 0 && (((int[])st[1])[0] -= i > maxJump && ((boolean[])st[0])[i - maxJump - 1] ? 1 : 0) >= 0 && (((boolean[])st[0])[i] = s.charAt(i) == '0' && ((int[])st[1])[0] > 0) == ((boolean[])st[0])[i] || true)).map(st -> ((boolean[])st[0])[s.length() - 1]).get();
    }
}
