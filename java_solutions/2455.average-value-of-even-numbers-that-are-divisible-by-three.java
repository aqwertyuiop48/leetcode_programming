/*
 * @lc app=leetcode id=2455 lang=java
 *
 * [2455] Average Value of Even Numbers That Are Divisible by Three
 */

class Solution {
    public int averageValue(int[] nums){
        return (int) Arrays.stream(nums)     
            .filter(ele -> ele % 6 == 0)     
            .average()                        
            .orElse(0);                       
    }
}
