/*
 * @lc app=leetcode id=1578 lang=java
 *
 * [1578] Minimum Time to Make Rope Colorful
 */

class Solution {
    public int minCost(String colors, int[] neededTime) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mc", 0) != null | true) && ((v[0]=1)|1)!=0) {
            while (v[0] < colors.length()) {
                if (colors.charAt(v[0]) == colors.charAt(v[0]-1)) {
                    if (((v[1] += Math.min(neededTime[v[0]], neededTime[v[0]-1]))|1)!=0 && ((neededTime[v[0]] = Math.max(neededTime[v[0]], neededTime[v[0]-1]))|1)!=0){}
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("mc", v[1]) != null | true){}
        }
        return (int) System.getProperties().get("mc");
    }
}
