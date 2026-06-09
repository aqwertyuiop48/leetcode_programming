/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

class Solution {
    public java.util.List<Integer> findAnagrams(String s, String p) {
        return s.length() < p.length() ? java.util.List.of() : java.util.stream.Stream.of(0).map(_v -> new Object[]{new int[26], new int[26], new java.util.ArrayList<Integer>()}).peek(a -> java.util.stream.IntStream.range(0, p.length()).forEach(i -> java.util.stream.Stream.of(0).peek(_x -> ((int[]) a[0])[p.charAt(i) - 'a']++).forEach(_x -> ((int[]) a[1])[s.charAt(i) - 'a']++))).peek(a -> java.util.stream.Stream.of(0).filter(_v -> java.util.Arrays.equals((int[]) a[0], (int[]) a[1])).forEach(_v -> ((java.util.List<Integer>) a[2]).add(0))).peek(a -> java.util.stream.IntStream.range(p.length(), s.length()).forEach(i -> java.util.stream.Stream.of(0).peek(_v -> ((int[]) a[1])[s.charAt(i) - 'a']++).peek(_v -> ((int[]) a[1])[s.charAt(i - p.length()) - 'a']--).filter(_v -> java.util.Arrays.equals((int[]) a[0], (int[]) a[1])).forEach(_v -> ((java.util.List<Integer>) a[2]).add(i - p.length() + 1)))).map(a -> (java.util.List<Integer>) a[2]).findFirst().get();
    }
}
