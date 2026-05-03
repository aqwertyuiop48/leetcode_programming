/*
 * @lc app=leetcode id=1864 lang=java
 *
 * [1864] Minimum Number of Swaps to Make the Binary String Alternating
 */

class Solution {
    public int minSwaps(String s) {
        return java.util.Optional.of(new int[]{ (int)s.chars().filter(c->c=='1').count(), (int)s.chars().filter(c->c=='0').count() }).map(st -> Math.abs(st[0]-st[1]) > 1 ? -1 : (st[0] > st[1] ? (int)java.util.stream.IntStream.range(0,s.length()).filter(i->s.charAt(i)-'0'!=(i%2==0?1:0)).count()/2 : st[1] > st[0] ? (int)java.util.stream.IntStream.range(0,s.length()).filter(i->s.charAt(i)-'0'!=(i%2==0?0:1)).count()/2 : Math.min((int)java.util.stream.IntStream.range(0,s.length()).filter(i->s.charAt(i)-'0'!=(i%2==0?1:0)).count()/2, (int)java.util.stream.IntStream.range(0,s.length()).filter(i->s.charAt(i)-'0'!=(i%2==0?0:1)).count()/2))).get();
    }
}
