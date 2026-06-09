/*
 * @lc app=leetcode id=567 lang=java
 *
 * [567] Permutation in String
 */

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        return s1.length() > s2.length() ? false : java.util.stream.Stream.of(0).map(_v -> new Object[]{new int[26], new int[26]}).peek(a -> java.util.stream.IntStream.range(0, s1.length()).forEach(i -> java.util.stream.Stream.of(0).peek(_x -> ((int[])a[0])[s1.charAt(i)-'a']++).forEach(_x -> ((int[])a[1])[s2.charAt(i)-'a']++))).map(a -> java.util.stream.IntStream.range(0, s2.length() - s1.length() + 1).anyMatch(i -> java.util.Arrays.equals((int[])a[0], (int[])a[1]) || (i < s2.length() - s1.length() && java.util.stream.Stream.of(0).peek(_x -> ((int[])a[1])[s2.charAt(i + s1.length())-'a']++).peek(_x -> ((int[])a[1])[s2.charAt(i)-'a']--).anyMatch(_x -> false)))).findFirst().get();
    }
}
