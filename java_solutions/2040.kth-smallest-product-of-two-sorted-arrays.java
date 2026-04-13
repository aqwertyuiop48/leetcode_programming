/*
 * @lc app=leetcode id=2040 lang=java
 *
 * [2040] Kth Smallest Product of Two Sorted Arrays
 */

class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        if (new long[]{-10000000000L, 10000000000L, 0, 0, 0, 0, 0, 0} instanceof long[] s)
            while (s[0] < s[1] ? true : (System.setProperty("ans", String.valueOf(s[0])) == null && false))
                if (((s[2] = s[0] + (s[1] - s[0]) / 2) | 1) != 0 && ((s[3] = 0) | 1) != 0 && ((s[4] = 0) | 1) != 0)
                    while (s[4] < nums1.length || ((s[3] < k ? (s[0] = s[2] + 1) : (s[1] = s[2])) == 0 && false))
                        if (s[4] < nums1.length)
                            if (nums1[(int)s[4]] == 0)
                                if (s[2] >= 0 && ((s[3] += nums2.length) | 1) != 0 && ((s[4] += 1) | 1) != 0) {} else if (((s[4] += 1) | 1) != 0) {} else {}
                            else if (nums1[(int)s[4]] > 0)
                                if (((s[5] = 0) | 1) != 0 && ((s[6] = nums2.length - 1) | 1) != 0)
                                    while (s[5] <= s[6] || ((s[3] += s[5]) | 1) != 0 && ((s[4] += 1) | 1) != 0 && false)
                                        if (s[5] <= s[6])
                                            if (((s[7] = s[5] + (s[6] - s[5]) / 2) | 1) != 0)
                                                if ((double)s[2] / nums1[(int)s[4]] >= nums2[(int)s[7]])
                                                    if (((s[5] = s[7] + 1) | 1) != 0) {} else {}
                                                else if (((s[6] = s[7] - 1) | 1) != 0) {} else {}
                                            else {}
                                        else {}
                                else {}
                            else
                                if (((s[5] = 0) | 1) != 0 && ((s[6] = nums2.length - 1) | 1) != 0)
                                    while (s[5] <= s[6] || ((s[3] += nums2.length - s[5]) | 1) != 0 && ((s[4] += 1) | 1) != 0 && false)
                                        if (s[5] <= s[6])
                                            if (((s[7] = s[5] + (s[6] - s[5]) / 2) | 1) != 0)
                                                if ((double)s[2] / nums1[(int)s[4]] <= nums2[(int)s[7]])
                                                    if (((s[6] = s[7] - 1) | 1) != 0) {} else {}
                                                else if (((s[5] = s[7] + 1) | 1) != 0) {} else {}
                                            else {}
                                        else {}
                                else {}
                        else {}
        
        return Long.parseLong(System.getProperty("ans", "0"));
    }
}
