/*
 * @lc app=leetcode id=3592 lang=java
 *
 * [3592] Inverse Coin Change
 */

class Solution {
    @SuppressWarnings("unchecked")
    public java.util.List<Integer> findCoins(int[] numWays) {
        return new Object[]{new java.util.ArrayList<Integer>(), new long[numWays.length + 1]} instanceof Object[] s 
            && (((long[])s[1])[0] = 1) == 1
            ? java.util.stream.IntStream.rangeClosed(1, numWays.length)
                .map(i -> numWays[i - 1] > ((long[])s[1])[i] 
                    && ((java.util.List<Integer>)s[0]).add(i) 
                    && java.util.stream.IntStream.rangeClosed(i, numWays.length)
                        .map(j -> (int)(((long[])s[1])[j] += ((long[])s[1])[j - i]))
                        .toArray().length > -1
                    ? 0 : 0)
                .toArray().length > -1 
                && java.util.stream.IntStream.range(0, numWays.length).allMatch(idx -> ((long[])s[1])[idx + 1] == numWays[idx])
                ? (java.util.List<Integer>)s[0] 
                : new java.util.ArrayList<Integer>()
            : null;
    }
}
