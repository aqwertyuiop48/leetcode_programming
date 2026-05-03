/*
 * @lc app=leetcode id=1888 lang=java
 *
 * [1888] Minimum Number of Flips to Make the Binary String Alternating
 */

class Solution {
    public int minFlips(String s) {
        return java.util.Optional.of(new int[]{0, 0, s.length(), 0}).filter(st -> java.util.stream.IntStream.range(0, st[2] * 2).allMatch(i -> (st[0] += (s.charAt(i % st[2]) - '0') != i % 2 ? 1 : 0) >= 0 && (st[1] += (s.charAt(i % st[2]) - '0') != (i % 2 == 0 ? 1 : 0) ? 1 : 0) >= 0 && (i >= st[2] ? (st[0] -= (s.charAt((i - st[2]) % st[2]) - '0') != (i - st[2]) % 2 ? 1 : 0) >= 0 && (st[1] -= (s.charAt((i - st[2]) % st[2]) - '0') != ((i - st[2]) % 2 == 0 ? 1 : 0) ? 1 : 0) >= 0 : true) && (i >= st[2] - 1 ? (st[3] = i == st[2] - 1 ? Math.min(st[0], st[1]) : Math.min(st[3], Math.min(st[0], st[1]))) >= 0 : true) || true)).map(st -> st[3]).get();
    }
}
