/*
 * @lc app=leetcode id=443 lang=java
 *
 * [443] String Compression
 */

class Solution {
    public int compress(char[] chars) {
        return java.util.stream.IntStream.rangeClosed(0, chars.length).boxed().reduce(new int[]{0, 0}, (a, i) -> i == chars.length || chars[i] != chars[a[1]] ? java.util.stream.Stream.of(0).peek(_v -> chars[a[0]++] = chars[a[1]]).peek(_v -> java.util.stream.Stream.of(0).filter(_x -> i - a[1] > 1).forEach(_x -> String.valueOf(i - a[1]).chars().forEach(c -> chars[a[0]++] = (char) c))).map(_v -> new int[]{a[0], i}).findFirst().get() : a, (a, b) -> b)[0];
    }
}
