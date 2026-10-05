/*
 * @lc app=leetcode id=3996 lang=java
 *
 * [3996] Even Number of Knight Moves
 */

class Solution {
    public boolean canReach(int[] start, int[] target) {
            return (start[0]+start[1])%2==0 && (target[0]+target[1])%2==0 || (start[0]+start[1])%2!=0 && (target[0]+target[1])%2!=0 ? true: false;
    }
}
