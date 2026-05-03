/*
 * @lc app=leetcode id=1170 lang=java
 *
 * [1170] Compare Strings by Frequency of the Smallest Character
 */

class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        return new Object[]{java.util.Arrays.stream(words).mapToInt(s -> (int)s.chars().filter(c -> c == s.chars().min().getAsInt()).count()).sorted().toArray()} instanceof Object[] o && o[0] instanceof int[] w ? java.util.Arrays.stream(queries).mapToInt(q -> (int)q.chars().filter(c -> c == q.chars().min().getAsInt()).count()).map(count -> (int)java.util.stream.IntStream.range(0, w.length).filter(i -> w[i] > count).count()).toArray() : new int[0];
    }
}
