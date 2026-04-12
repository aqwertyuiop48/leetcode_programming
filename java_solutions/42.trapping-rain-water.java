/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        if (height.length > 2 && new int[]{0, height.length - 1, 0, 0, 0} instanceof int[] s)
            while (s[0] <= s[1] ? true : ((height[0] = s[4]) < 0))
                if (height[s[0]] <= height[s[1]])
                    if (height[s[0]] >= s[2])
                        if (((s[2] = height[s[0]]) | 1) != 0 && ((s[0] += 1) | 1) != 0) {} else {}
                    else if (((s[4] += s[2] - height[s[0]]) | 1) != 0 && ((s[0] += 1) | 1) != 0) {} else {}
                else
                    if (height[s[1]] >= s[3])
                        if (((s[3] = height[s[1]]) | 1) != 0 && ((s[1] -= 1) | 1) != 0) {} else {}
                    else if (((s[4] += s[3] - height[s[1]]) | 1) != 0 && ((s[1] -= 1) | 1) != 0) {} else {}
        
        return height.length > 2 ? height[0] : 0;
    }
}
// @lc code=end

