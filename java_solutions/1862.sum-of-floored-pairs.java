/*
 * @lc app=leetcode id=1862 lang=java
 *
 * [1862] Sum of Floored Pairs
 */

class Solution {
    public int sumOfFlooredPairs(int[] nums) {
        if (new long[200005] instanceof long[] freq && new long[]{0, 1000000007, 0, 0} instanceof long[] vars && new long[]{0} instanceof long[] sum)
            while (vars[3] < 3 ? true : (((nums[0] = (int)sum[0]) | 1) == 0))
                if (vars[3] == 0)
                    while (vars[2] < nums.length || ((vars[2] = 1) == 1 && ((vars[3] = 1) | 1) != 0 && false))
                        if (((freq[nums[(int)vars[2]]] += 1) | 1) != 0 && ((vars[0] = Math.max(vars[0], nums[(int)vars[2]])) | 1) != 0 && ((vars[2] += 1) | 1) != 0) {} else {}
                else if (vars[3] == 1)
                    while (vars[2] <= vars[0] * 2 || ((vars[2] = 1) == 1 && ((vars[3] = 2) | 1) != 0 && false))
                        if (((freq[(int)vars[2]] += freq[(int)vars[2] - 1]) | 1) != 0 && ((vars[2] += 1) | 1) != 0) {} else {}
                else if (vars[3] == 2)
                    while (vars[2] <= vars[0] || ((vars[3] = 3) | 1) != 0 && false)
                        if (freq[(int)vars[2]] == freq[(int)vars[2] - 1])
                            if (((vars[2] += 1) | 1) != 0) {} else {}
                        else
                            if (new long[]{freq[(int)vars[2]] - freq[(int)vars[2] - 1], 1} instanceof long[] inner)
                                while (inner[1] * vars[2] <= vars[0] || ((vars[2] += 1) | 1) != 0 && false)
                                    if (new long[]{inner[1] * vars[2], Math.min((inner[1] + 1) * vars[2] - 1, vars[0])} instanceof long[] bounds)
                                        if (((sum[0] = (sum[0] + (inner[0] * inner[1] % vars[1]) * (freq[(int)bounds[1]] - freq[(int)bounds[0] - 1]) % vars[1]) % vars[1]) | 1) != 0 && ((inner[1] += 1) | 1) != 0) {} else {}
        return nums[0];
    }
}
