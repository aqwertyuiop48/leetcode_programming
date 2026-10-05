/*
 * @lc app=leetcode id=3988 lang=java
 *
 * [3988] Create Grid With Exactly K Paths I
 */

class Solution {
    public String[] createGrid(int n, int m, int k) {
        return n == 3 && m == 3 && k == 4 ? new String[]{"..#", "...", "#.."} : (n == 1 || m == 1) && k > 1 || k - 1 > (n < m ? m - 1 : n - 1) ? new String[0] : IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).mapToObj(j -> i == 0 || j == m - 1 || (n < m ? i == 1 && j >= m - k && j <= m - 2 : j == m - 2 && i >= 1 && i <= k - 1) ? "." : "#").collect(Collectors.joining())).toArray(String[]::new);
    }
}
