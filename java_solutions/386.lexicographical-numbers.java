/*
 * @lc app=leetcode id=386 lang=java
 *
 * [386] Lexicographical Numbers
 */

class Solution {
    public List<Integer> lexicalOrder(int n) {
        return Stream.iterate(1, i -> i != 0, i -> i * 10 <= n ? i * 10 : Stream.iterate(i, j -> j > 0, j -> j / 10).filter(j -> j + 1 <= n && j % 10 != 9).findFirst().map(j -> j + 1).orElse(0)).limit(n).collect(Collectors.toList());
    }
}
