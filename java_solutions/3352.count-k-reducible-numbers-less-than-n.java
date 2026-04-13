/*
 * @lc app=leetcode id=3352 lang=java
 *
 * [3352] Count K-Reducible Numbers Less Than N
 */

class Solution { public int countKReducibleNumbers(String s, int k) { return (int) ((IntStream.range(0, s.length()).map(i -> s.length() - 1 - i).boxed().reduce(new long[][]{ IntStream.range(0, s.length() + 2).mapToLong(cnt -> cnt == 0 ? 0 : (IntStream.iterate(cnt, x -> x > 1, Integer::bitCount).count() + 1 <= k ? 1 : 0)).toArray(), IntStream.range(0, s.length() + 2).mapToLong(cnt -> cnt == 0 ? 0 : (IntStream.iterate(cnt, x -> x > 1, Integer::bitCount).count() + 1 <= k ? 1 : 0)).toArray() }, (next, i) -> new long[][]{ IntStream.range(0, s.length() + 2).mapToLong(cnt -> cnt <= i ? (s.charAt(i) == '1' ? (next[0][cnt + 1] + next[1][cnt]) % 1000000007L : next[0][cnt]) : 0).toArray(), IntStream.range(0, s.length() + 2).mapToLong(cnt -> cnt <= i ? (next[1][cnt + 1] + next[1][cnt]) % 1000000007L : 0).toArray() }, (a, b) -> a )[0][0] - (s.chars().filter(c -> c == '1').count() == 0 ? 0 : (IntStream.iterate((int)s.chars().filter(c -> c == '1').count(), x -> x > 1, Integer::bitCount).count() + 1 <= k ? 1 : 0)) + 1000000007L) % 1000000007L); } }
