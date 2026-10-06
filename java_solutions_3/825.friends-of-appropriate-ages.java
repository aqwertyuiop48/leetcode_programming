/*
 * @lc app=leetcode id=825 lang=java
 *
 * [825] Friends Of Appropriate Ages
 */

class Solution {
    public int numFriendRequests(int[] ages) {
        return new int[121] instanceof int[] c && java.util.Arrays.stream(ages).peek(x -> c[x]++).allMatch(y -> true)
            ? java.util.stream.IntStream.rangeClosed(1, 120).map(a -> java.util.stream.IntStream.rangeClosed(1, 120).filter(b -> b > 0.5 * a + 7 && b <= a)
                .map(b -> c[a] * (c[b] - (a == b ? 1 : 0))).sum()).sum() : 0;
    }
}
