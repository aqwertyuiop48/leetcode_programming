/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return Stream.iterate(new int[]{1, n}, p -> isBadVersion(p[0] + (p[1] - p[0]) / 2) ? new int[]{p[0], p[0] + (p[1] - p[0]) / 2} : new int[]{p[0] + (p[1] - p[0]) / 2 + 1, p[1]}).filter(p -> p[0] >= p[1]).findFirst().get()[0];
    }
}
